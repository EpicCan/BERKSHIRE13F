package com.inesa.demo.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Berk13f {

    /**
     * total : 2
     * records : 49
     * page : 1
     * sort : current_mv
     * dir : desc
     * rows : [{"symbol":"AAPL","permalink":"aapl","security_type":"SH","name":"Apple Inc","sector":"INFORMATION TECHNOLOGY","industry":"COMPUTERS & PERIPHERALS","current_shares":8.95136175E8,"previous_shares":8.94802319E8,"shares_change":333856,"position_change_type":"addition","percent_shares_change":0.0373,"current_ranking":1,"previous_ranking":1,"current_percent_of_portfolio":38.897,"previous_percent_of_portfolio":41.764,"current_mv":1.16305043218E11,"previous_mv":1.23661679E11,"stock_id":195,"percent_ownership":"5.6524636","quarter_first_owned":"Q1 2016","quarter_id_owned":61,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":37.2088,"recent_price":149.4,"quarter_end_price":129.93,"id":null},{"symbol":"BAC","permalink":"bac","security_type":"SH","name":"Bank of America Corp. (North Carolina National Bank)","sector":"FINANCE","industry":"BANKS","current_shares":1.010100606E9,"previous_shares":1.010100606E9,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":2,"previous_ranking":2,"current_percent_of_portfolio":11.1885,"previous_percent_of_portfolio":10.3024,"current_mv":3.3454532071E10,"previous_mv":3.0505039E10,"stock_id":205,"percent_ownership":"12.5909522","quarter_first_owned":"Q3 2017","quarter_id_owned":67,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":25.5185,"recent_price":34.26,"quarter_end_price":33.12,"id":null},{"symbol":"CVX","permalink":"cvx","security_type":"SH","name":"Chevron Corp. (Standard Oil of California)","sector":"ENERGY","industry":"INTEGRATED OIL & GAS","current_shares":1.62975771E8,"previous_shares":1.65359318E8,"shares_change":-2383547,"position_change_type":"reduction","percent_shares_change":-1.4414,"current_ranking":3,"previous_ranking":3,"current_percent_of_portfolio":9.7832,"previous_percent_of_portfolio":8.0235,"current_mv":2.9252521137E10,"previous_mv":2.3757173E10,"stock_id":214,"percent_ownership":"8.4284507","quarter_first_owned":"Q4 2020","quarter_id_owned":80,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":126.3156,"recent_price":161.93,"quarter_end_price":179.49,"id":null},{"symbol":"KO","permalink":"ko","security_type":"SH","name":"Coca Cola Co.","sector":"CONSUMER STAPLES","industry":"BEVERAGES","current_shares":4.0E8,"previous_shares":4.0E8,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":4,"previous_ranking":4,"current_percent_of_portfolio":8.5095,"previous_percent_of_portfolio":7.5678,"current_mv":2.5444E10,"previous_mv":2.2407999E10,"stock_id":386,"percent_ownership":"9.2495959","quarter_first_owned":"Q1 2001","quarter_id_owned":1,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":27.1275,"recent_price":60.09,"quarter_end_price":63.61,"id":null},{"symbol":"AXP","permalink":"axp","security_type":"SH","name":"American Express Co","sector":"FINANCE","industry":"CONSUMER FINANCE","current_shares":1.516107E8,"previous_shares":1.516107E8,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":5,"previous_ranking":5,"current_percent_of_portfolio":7.4916,"previous_percent_of_portfolio":6.9078,"current_mv":2.2400480926E10,"previous_mv":2.04538E10,"stock_id":368,"percent_ownership":"20.2896234","quarter_first_owned":"Q1 2001","quarter_id_owned":1,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":39.311,"recent_price":175.14,"quarter_end_price":147.75,"id":null},{"symbol":"KHC","permalink":"khc","security_type":"SH","name":"Kraft Heinz Co. (The)","sector":"CONSUMER STAPLES","industry":"FOOD PRODUCTS","current_shares":3.25634818E8,"previous_shares":3.25634818E8,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":6,"previous_ranking":7,"current_percent_of_portfolio":4.4335,"previous_percent_of_portfolio":3.6677,"current_mv":1.3256593441E10,"previous_mv":1.0859921E10,"stock_id":178038,"percent_ownership":"26.5839496","quarter_first_owned":"Q3 2015","quarter_id_owned":59,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":75.4858,"recent_price":39.75,"quarter_end_price":40.71,"id":null},{"symbol":"OXY","permalink":"oxy","security_type":"SH","name":"Occidental Petroleum Corp.","sector":"ENERGY","industry":"INTEGRATED OIL & GAS","current_shares":1.9435165E8,"previous_shares":1.9435165E8,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":7,"previous_ranking":6,"current_percent_of_portfolio":4.0943,"previous_percent_of_portfolio":4.0334,"current_mv":1.2242210434E10,"previous_mv":1.1942909E10,"stock_id":442,"percent_ownership":"21.3828391","quarter_first_owned":"Q1 2022","quarter_id_owned":85,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":46.4313,"recent_price":59.22,"quarter_end_price":62.99,"id":null},{"symbol":"MCO","permalink":"mco","security_type":"SH","name":"Moodys Corp","sector":"FINANCE","industry":"GENERAL FINANCE","current_shares":2.4669778E7,"previous_shares":2.4669778E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":8,"previous_ranking":8,"current_percent_of_portfolio":2.2988,"previous_percent_of_portfolio":2.0255,"current_mv":6.873493546E9,"previous_mv":5.99747E9,"stock_id":2707,"percent_ownership":"13.4660360","quarter_first_owned":"Q1 2001","quarter_id_owned":1,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":13.7106,"recent_price":294.44,"quarter_end_price":278.62,"id":null},{"symbol":"ATVI","permalink":"atvi","security_type":"SH","name":"Activision Blizzard Inc","sector":"INFORMATION TECHNOLOGY","industry":"SOFTWARE","current_shares":5.2717075E7,"previous_shares":6.0141866E7,"shares_change":-7424791,"position_change_type":"reduction","percent_shares_change":-12.3455,"current_ranking":9,"previous_ranking":9,"current_percent_of_portfolio":1.3496,"previous_percent_of_portfolio":1.51,"current_mv":4.035492091E9,"previous_mv":4.470946E9,"stock_id":11336,"percent_ownership":"6.7359276","quarter_first_owned":"Q4 2021","quarter_id_owned":84,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":73.2816,"recent_price":77.07,"quarter_end_price":76.55,"id":null},{"symbol":"HPQ","permalink":"hpq","security_type":"SH","name":"HP Inc","sector":"INFORMATION TECHNOLOGY","industry":"COMPUTERS & PERIPHERALS","current_shares":1.04476035E8,"previous_shares":1.04476035E8,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":10,"previous_ranking":13,"current_percent_of_portfolio":0.9389,"previous_percent_of_portfolio":0.8793,"current_mv":2.807271061E9,"previous_mv":2.603542E9,"stock_id":234,"percent_ownership":"10.6375281","quarter_first_owned":"Q1 2022","quarter_id_owned":85,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":36.9374,"recent_price":29.55,"quarter_end_price":26.87,"id":null},{"symbol":"DVA","permalink":"dva","security_type":"SH","name":"Davita Inc.","sector":"HEALTH CARE","industry":"HEALTH CARE SERVICES","current_shares":3.609557E7,"previous_shares":3.609557E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":11,"previous_ranking":12,"current_percent_of_portfolio":0.9014,"previous_percent_of_portfolio":1.009,"current_mv":2.695256212E9,"previous_mv":2.98763E9,"stock_id":3395,"percent_ownership":"40.0616759","quarter_first_owned":"Q4 2011","quarter_id_owned":44,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":48.8505,"recent_price":82.87,"quarter_end_price":74.67,"id":null},{"symbol":"VRSN","permalink":"vrsn","security_type":"SH","name":"VeriSign Inc.","sector":"COMMUNICATIONS","industry":"INTERNET","current_shares":1.2815613E7,"previous_shares":1.2815613E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":12,"previous_ranking":16,"current_percent_of_portfolio":0.8805,"previous_percent_of_portfolio":0.7518,"current_mv":2.632839535E9,"previous_mv":2.226072E9,"stock_id":960,"percent_ownership":"12.0883243","quarter_first_owned":"Q4 2012","quarter_id_owned":48,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":45.0349,"recent_price":202,"quarter_end_price":205.44,"id":null},{"symbol":"C","permalink":"c","security_type":"SH","name":"Citigroup, Inc.","sector":"FINANCE","industry":"BANKS","current_shares":5.5155797E7,"previous_shares":5.5155797E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":13,"previous_ranking":15,"current_percent_of_portfolio":0.8343,"previous_percent_of_portfolio":0.7762,"current_mv":2.494696699E9,"previous_mv":2.298341E9,"stock_id":216,"percent_ownership":"2.8477020","quarter_first_owned":"Q1 2022","quarter_id_owned":85,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":61.5642,"recent_price":50.38,"quarter_end_price":45.23,"id":null},{"symbol":"KR","permalink":"kr","security_type":"SH","name":"Kroger Co.","sector":"CONSUMER STAPLES","industry":"RETAIL - FOOD & DRUG","current_shares":5.0E7,"previous_shares":5.0268823E7,"shares_change":-268823,"position_change_type":"reduction","percent_shares_change":-0.5348,"current_ranking":14,"previous_ranking":17,"current_percent_of_portfolio":0.7455,"previous_percent_of_portfolio":0.7428,"current_mv":2.229E9,"previous_mv":2.19926E9,"stock_id":677,"percent_ownership":"6.9849779","quarter_first_owned":"Q4 2019","quarter_id_owned":76,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":31.7303,"recent_price":43.91,"quarter_end_price":44.58,"id":null},{"symbol":"V","permalink":"v","security_type":"SH","name":"VISA Inc","sector":"FINANCE","industry":"CONSUMER FINANCE","current_shares":8297460,"previous_shares":8297460,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":15,"previous_ranking":21,"current_percent_of_portfolio":0.5765,"previous_percent_of_portfolio":0.4978,"current_mv":1.72388029E9,"previous_mv":1.474044E9,"stock_id":45920,"percent_ownership":"0.4389228","quarter_first_owned":"Q3 2011","quarter_id_owned":43,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":37.0713,"recent_price":221.13,"quarter_end_price":207.76,"id":null},{"symbol":"LSXMK","permalink":"lsxmk","security_type":"SH","name":"Liberty Sirius XM Group, Series C","sector":"COMMUNICATIONS","industry":"BROADCASTING","current_shares":4.3208291E7,"previous_shares":4.3208291E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":16,"previous_ranking":19,"current_percent_of_portfolio":0.5655,"previous_percent_of_portfolio":0.5503,"current_mv":1.690740426E9,"previous_mv":1.629386E9,"stock_id":196000,"percent_ownership":"N/A","quarter_first_owned":"Q2 2016","quarter_id_owned":62,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":33.2051,"recent_price":33,"quarter_end_price":39.13,"id":null},{"symbol":"GM","permalink":"gm","security_type":"SH","name":"General Motors Co","sector":"CONSUMER DISCRETIONARY","industry":"AUTOMOBILES AND MOTORCYCLES","current_shares":5.0E7,"previous_shares":5.0E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":17,"previous_ranking":20,"current_percent_of_portfolio":0.5625,"previous_percent_of_portfolio":0.5419,"current_mv":1.682E9,"previous_mv":1.6045E9,"stock_id":107357,"percent_ownership":"3.5193998","quarter_first_owned":"Q1 2012","quarter_id_owned":45,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":32.2403,"recent_price":39.25,"quarter_end_price":33.64,"id":null},{"symbol":"PARA","permalink":"cbs","security_type":"SH","name":"Paramount Global","sector":"COMMUNICATIONS","industry":"BROADCASTING","current_shares":9.3637189E7,"previous_shares":9.121651E7,"shares_change":2420679,"position_change_type":"addition","percent_shares_change":2.6538,"current_ranking":18,"previous_ranking":18,"current_percent_of_portfolio":0.5286,"previous_percent_of_portfolio":0.5866,"current_mv":1.58059575E9,"previous_mv":1.736763E9,"stock_id":2509,"percent_ownership":"15.3889638","quarter_first_owned":"Q1 2022","quarter_id_owned":85,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":30.6089,"recent_price":23.44,"quarter_end_price":16.88,"id":null},{"symbol":"MA","permalink":"ma","security_type":"SH","name":"Mastercard Inc","sector":"FINANCE","industry":"CONSUMER FINANCE","current_shares":3986648,"previous_shares":3986648,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":19,"previous_ranking":25,"current_percent_of_portfolio":0.4636,"previous_percent_of_portfolio":0.3828,"current_mv":1.386277109E9,"previous_mv":1.133563E9,"stock_id":4044,"percent_ownership":"0.4179739","quarter_first_owned":"Q1 2011","quarter_id_owned":41,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":38.5436,"recent_price":355.53,"quarter_end_price":347.73,"id":null},{"symbol":"AON","permalink":"aon","security_type":"SH","name":"Aon PLC","sector":"FINANCE","industry":"INSURANCE","current_shares":4396000,"previous_shares":4396000,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":20,"previous_ranking":23,"current_percent_of_portfolio":0.4413,"previous_percent_of_portfolio":0.3977,"current_mv":1.31941544E9,"previous_mv":1.177556E9,"stock_id":11339,"percent_ownership":"2.1251813","quarter_first_owned":"Q1 2021","quarter_id_owned":81,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":218.5594,"recent_price":304.48,"quarter_end_price":300.14,"id":null},{"symbol":"CHTR","permalink":"chtr","security_type":"SH","name":"Charter Communications Inc","sector":"COMMUNICATIONS","industry":"ENTERTAINMENT","current_shares":3828941,"previous_shares":3828941,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":21,"previous_ranking":24,"current_percent_of_portfolio":0.4342,"previous_percent_of_portfolio":0.3923,"current_mv":1.298393893E9,"previous_mv":1.161509E9,"stock_id":87254,"percent_ownership":"2.4596164","quarter_first_owned":"Q2 2014","quarter_id_owned":54,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":163.1543,"recent_price":383.23,"quarter_end_price":339.1,"id":null},{"symbol":"BK","permalink":"bk","security_type":"SH","name":"Bank Of New York Mellon Corp","sector":"FINANCE","industry":"BANKS","current_shares":2.5069867E7,"previous_shares":6.2210878E7,"shares_change":-3.7141011E7,"position_change_type":"reduction","percent_shares_change":-59.7018,"current_ranking":22,"previous_ranking":14,"current_percent_of_portfolio":0.3817,"previous_percent_of_portfolio":0.8093,"current_mv":1.141180346E9,"previous_mv":2.396364E9,"stock_id":2534,"percent_ownership":"3.1016317","quarter_first_owned":"Q3 2010","quarter_id_owned":39,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":43.6035,"recent_price":50.29,"quarter_end_price":45.52,"id":null},{"symbol":"MCK","permalink":"mck","security_type":"SH","name":"McKesson Corp.","sector":"HEALTH CARE","industry":"HEALTH CARE SERVICES","current_shares":2855514,"previous_shares":3198344,"shares_change":-342830,"position_change_type":"reduction","percent_shares_change":-10.719,"current_ranking":23,"previous_ranking":26,"current_percent_of_portfolio":0.3582,"previous_percent_of_portfolio":0.3671,"current_mv":1.071160412E9,"previous_mv":1.087021E9,"stock_id":252,"percent_ownership":"2.0138542","quarter_first_owned":"Q1 2022","quarter_id_owned":85,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":266.2269,"recent_price":360.33,"quarter_end_price":375.12,"id":null},{"symbol":"CE","permalink":"ce","security_type":"SH","name":"Celanese Corp","sector":"MATERIALS","industry":"CHEMICALS","current_shares":9710183,"previous_shares":9710183,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":24,"previous_ranking":28,"current_percent_of_portfolio":0.332,"previous_percent_of_portfolio":0.2963,"current_mv":9.9276911E8,"previous_mv":8.77219E8,"stock_id":622,"percent_ownership":"8.9554143","quarter_first_owned":"Q1 2022","quarter_id_owned":85,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":149.411,"recent_price":114.78,"quarter_end_price":102.24,"id":null},{"symbol":"AMZN","permalink":"amzn","security_type":"SH","name":"Amazon.com Inc.","sector":"CONSUMER DISCRETIONARY","industry":"RETAIL - INTERNET & MEDIA","current_shares":1.0666E7,"previous_shares":1.0666E7,"shares_change":0,"position_change_type":null,"percent_shares_change":0,"current_ranking":25,"previous_ranking":22,"current_percent_of_portfolio":0.2996,"previous_percent_of_portfolio":0.407,"current_mv":8.95944E8,"previous_mv":1.205258E9,"stock_id":3573,"percent_ownership":"0.1045517","quarter_first_owned":"Q1 2019","quarter_id_owned":73,"source_type":"13F","source_date":"2022-12-31","filing_date":"2023-02-14","avg_price":82.9922,"recent_price":95.82,"quarter_end_price":84,"id":null}]
     */

    public int total;
    public int records;
    public int page;
    public String sort;
    public String dir;
    public List<RowsBean> rows;

    @NoArgsConstructor
    @Data
    public static class RowsBean {
        /**
         * symbol : AAPL
         * permalink : aapl
         * security_type : SH
         * name : Apple Inc
         * sector : INFORMATION TECHNOLOGY
         * industry : COMPUTERS & PERIPHERALS
         * current_shares : 8.95136175E8
         * previous_shares : 8.94802319E8
         * shares_change : 333856
         * position_change_type : addition
         * percent_shares_change : 0.0373
         * current_ranking : 1
         * previous_ranking : 1
         * current_percent_of_portfolio : 38.897
         * previous_percent_of_portfolio : 41.764
         * current_mv : 1.16305043218E11
         * previous_mv : 1.23661679E11
         * stock_id : 195
         * percent_ownership : 5.6524636
         * quarter_first_owned : Q1 2016
         * quarter_id_owned : 61
         * source_type : 13F
         * source_date : 2022-12-31
         * filing_date : 2023-02-14
         * avg_price : 37.2088
         * recent_price : 149.4
         * quarter_end_price : 129.93
         * id : null
         */

        public String symbol;
        public String permalink;
        public String security_type;
        public String name;
        public String sector;
        public String industry;
        public double current_shares;
        public double previous_shares;
        public int shares_change;
        public String position_change_type;
        public double percent_shares_change;
        public int current_ranking;
        public int previous_ranking;
        public double current_percent_of_portfolio;
        public double previous_percent_of_portfolio;
        public double current_mv;
        public double previous_mv;
        public int stock_id;
        public String percent_ownership;
        public String quarter_first_owned;
        public int quarter_id_owned;
        public String source_type;
        public String source_date;
        public String filing_date;
        public double avg_price;
        public double recent_price;
        public double quarter_end_price;
        public Object id;
    }
}
