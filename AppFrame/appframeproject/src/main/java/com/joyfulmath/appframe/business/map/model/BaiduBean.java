package com.joyfulmath.appframe.business.map.model;

/**
 * @author deman.lu
 * @version on 2016-03-24 15:30
 */
public class BaiduBean {

    public BaiduBean() {

    }

    public BaiduBean(String errorMessage) {
    }

    /**
     * address : CN|吉林|长春|None|CERNET|1|None
     * content : {"address":"吉林省长春市","address_detail":{"city":"长春市","city_code":53,"district":"","province":"吉林省","street":"","street_number":""},"point":{"x":"125.31364243","y":"43.89833761"}}
     * status : 0
     */

    private String address;
    /**
     * address : 吉林省长春市
     * address_detail : {"city":"长春市","city_code":53,"district":"","province":"吉林省","street":"","street_number":""}
     * point : {"x":"125.31364243","y":"43.89833761"}
     */

    private ContentEntity content;
    private int status;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ContentEntity getContent() {
        return content;
    }

    public void setContent(ContentEntity content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class ContentEntity {
        private String address;
        /**
         * city : 长春市
         * city_code : 53
         * district :
         * province : 吉林省
         * street :
         * street_number :
         */

        private AddressDetailEntity address_detail;
        /**
         * x : 125.31364243
         * y : 43.89833761
         */

        private PointEntity point;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public AddressDetailEntity getAddress_detail() {
            return address_detail;
        }

        public void setAddress_detail(AddressDetailEntity address_detail) {
            this.address_detail = address_detail;
        }

        public PointEntity getPoint() {
            return point;
        }

        public void setPoint(PointEntity point) {
            this.point = point;
        }

        public static class AddressDetailEntity {
            private String city;
            private int city_code;
            private String district;
            private String province;
            private String street;
            private String street_number;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public int getCity_code() {
                return city_code;
            }

            public void setCity_code(int city_code) {
                this.city_code = city_code;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getStreet_number() {
                return street_number;
            }

            public void setStreet_number(String street_number) {
                this.street_number = street_number;
            }
        }

        public static class PointEntity {
            private String x;
            private String y;

            public String getX() {
                return x;
            }

            public void setX(String x) {
                this.x = x;
            }

            public String getY() {
                return y;
            }

            public void setY(String y) {
                this.y = y;
            }
        }
    }
}
