package com.inesa.demo.controller;

import com.google.gson.Gson;
import com.inesa.demo.po.Berk13f;
import com.inesa.demo.po.User;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
public class ReceiveController {
    @GetMapping("/api/data")
    public String login() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet berk13f = new HttpGet("https://whalewisdom.com/filer/holdings?id=berkshire-hathaway-inc&q1=-1&type_filter=1,2,3,4&symbol=&change_filter=&minimum_ranking=&minimum_shares=&is_etf=0&sc=true&sort=current_mv&order=desc&offset=0&limit=25");
        berk13f.addHeader("Content-Type", "application/json;charset=utf8");
        CloseableHttpResponse response13f = httpClient.execute(berk13f);
        String res = EntityUtils.toString(response13f.getEntity());

        Gson gson = new Gson();
        Berk13f berk13f1 = gson.fromJson(res, Berk13f.class);
        List<Berk13f.RowsBean> rows = berk13f1.getRows();

        String[][] arr = new String[rows.size()][4];

        for (int i = 0; i < rows.size(); i++) {
            // AAPL
            String symbol = rows.get(i).getSymbol();
            // 投资组合所占比例
            double current_percent_of_portfolio = rows.get(i).getCurrent_percent_of_portfolio();
            // 统计日期
            String source_date = rows.get(i).getSource_date();
            // 持股比例
            String percent_ownership = rows.get(i).getPercent_ownership();
            for (int  j= 0; j < 4; j++) {
                if(j==0){
                    arr[i][j] = symbol;
                }else if(j==1){
                    arr[i][j] =String.valueOf(current_percent_of_portfolio);
                }else if(j==2){
                    arr[i][j] =source_date;
                }else if(j==3){
                    arr[i][j] =percent_ownership;
                }
            }
        }
        String json = gson.toJson(arr);
        return json;
    }
}
