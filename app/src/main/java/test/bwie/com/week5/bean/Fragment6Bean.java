package test.bwie.com.week5.bean;

import java.util.List;

/**
 * Created by dy on 2017/11/27.
 */

public class Fragment6Bean extends BaseBean {

    /**
     * msg : 成功
     * ret : {"pnum":1,"totalRecords":9,"records":20,"list":[{"msg":"一定要听结尾曲！太好听了","phoneNumber":"㌍㌫㌶㍊㍍㍑㌫㌶㍍","dataId":"ff8080815fa38f91015fb086ef376df8","userPic":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTK8ichLPACYaD80Y1SZSpqXeTaqYzgKcDaVa3GExDn1SicuQuHYBcJ7ER2HOXbZibkD3qwHQXnNRt3gg/0","time":"2017-11-12 21:59:13","likeNum":0},{"msg":"好看的啊","phoneNumber":"可乐","dataId":"ff8080815f387ddb015f4a0eab976d3a","userPic":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJZwFrofNic2lqNqGuCFibqbRxDx64gOdQicCGYjllic0NTkB0E3OJ2PCyY4dLw4SbKhCUaUvPfJnUGuw/0","time":"2017-10-24 00:26:36","likeNum":0},{"msg":"不是挺好看的吗","phoneNumber":"可乐","dataId":"ff8080815f387ddb015f4a0e5c946d39","userPic":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJZwFrofNic2lqNqGuCFibqbRxDx64gOdQicCGYjllic0NTkB0E3OJ2PCyY4dLw4SbKhCUaUvPfJnUGuw/0","time":"2017-10-24 00:26:16","likeNum":2},{"msg":"真不好看，讲真的的我觉得这特么是辣鸡","phoneNumber":"187****7961","dataId":"ff8080815e7fa211015e809977fc097b","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/09/05/1504610734973228271.jpg","time":"2017-09-14 21:34:54","likeNum":1},{"msg":"一开始不好看","phoneNumber":"筱雯","dataId":"ff8080815d63eb9a015d747321a94845","userPic":"http://wx.qlogo.cn/mmhead/zsUXYY6y4cLuZN7dPKusSD2jzPVBHt4GbeeaqyamgwicNEwM3MRxkag/0","time":"2017-07-24 19:54:48","likeNum":2},{"msg":"整体一般，不推荐，除非你很有空。","phoneNumber":"一人一心一世界","dataId":"ff8080815cb03cdc015cc432992b2923","userPic":"","time":"2017-06-20 14:46:09","likeNum":1},{"msg":"朋友推荐的这部片子，看完之后觉得真的很棒！","phoneNumber":"你不懂我","dataId":"ff8080815cb03cdc015cc43299312925","userPic":"","time":"2017-06-13 12:31:09","likeNum":2},{"msg":"这几个演员，没一个我喜欢的，但我竟然把电影看\u2026\u2026完\u2026\u2026了\u2026\u2026","phoneNumber":"虚情假意","dataId":"ff8080815cb03cdc015cc432992f2924","userPic":"","time":"2017-05-15 15:58:09","likeNum":1},{"msg":"与主角相比，我更喜欢那几个配角，这是病吗？","phoneNumber":"看不到未来","dataId":"ff8080815cb03cdc015cc43299292922","userPic":"","time":"2017-05-14 17:38:09","likeNum":0}],"totalPnum":1}
     */

    private String msg;
    private RetBean ret;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RetBean getRet() {
        return ret;
    }

    public void setRet(RetBean ret) {
        this.ret = ret;
    }

    public static class RetBean {
        /**
         * pnum : 1
         * totalRecords : 9
         * records : 20
         * list : [{"msg":"一定要听结尾曲！太好听了","phoneNumber":"㌍㌫㌶㍊㍍㍑㌫㌶㍍","dataId":"ff8080815fa38f91015fb086ef376df8","userPic":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTK8ichLPACYaD80Y1SZSpqXeTaqYzgKcDaVa3GExDn1SicuQuHYBcJ7ER2HOXbZibkD3qwHQXnNRt3gg/0","time":"2017-11-12 21:59:13","likeNum":0},{"msg":"好看的啊","phoneNumber":"可乐","dataId":"ff8080815f387ddb015f4a0eab976d3a","userPic":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJZwFrofNic2lqNqGuCFibqbRxDx64gOdQicCGYjllic0NTkB0E3OJ2PCyY4dLw4SbKhCUaUvPfJnUGuw/0","time":"2017-10-24 00:26:36","likeNum":0},{"msg":"不是挺好看的吗","phoneNumber":"可乐","dataId":"ff8080815f387ddb015f4a0e5c946d39","userPic":"http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJZwFrofNic2lqNqGuCFibqbRxDx64gOdQicCGYjllic0NTkB0E3OJ2PCyY4dLw4SbKhCUaUvPfJnUGuw/0","time":"2017-10-24 00:26:16","likeNum":2},{"msg":"真不好看，讲真的的我觉得这特么是辣鸡","phoneNumber":"187****7961","dataId":"ff8080815e7fa211015e809977fc097b","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/09/05/1504610734973228271.jpg","time":"2017-09-14 21:34:54","likeNum":1},{"msg":"一开始不好看","phoneNumber":"筱雯","dataId":"ff8080815d63eb9a015d747321a94845","userPic":"http://wx.qlogo.cn/mmhead/zsUXYY6y4cLuZN7dPKusSD2jzPVBHt4GbeeaqyamgwicNEwM3MRxkag/0","time":"2017-07-24 19:54:48","likeNum":2},{"msg":"整体一般，不推荐，除非你很有空。","phoneNumber":"一人一心一世界","dataId":"ff8080815cb03cdc015cc432992b2923","userPic":"","time":"2017-06-20 14:46:09","likeNum":1},{"msg":"朋友推荐的这部片子，看完之后觉得真的很棒！","phoneNumber":"你不懂我","dataId":"ff8080815cb03cdc015cc43299312925","userPic":"","time":"2017-06-13 12:31:09","likeNum":2},{"msg":"这几个演员，没一个我喜欢的，但我竟然把电影看\u2026\u2026完\u2026\u2026了\u2026\u2026","phoneNumber":"虚情假意","dataId":"ff8080815cb03cdc015cc432992f2924","userPic":"","time":"2017-05-15 15:58:09","likeNum":1},{"msg":"与主角相比，我更喜欢那几个配角，这是病吗？","phoneNumber":"看不到未来","dataId":"ff8080815cb03cdc015cc43299292922","userPic":"","time":"2017-05-14 17:38:09","likeNum":0}]
         * totalPnum : 1
         */

        private int pnum;
        private int totalRecords;
        private int records;
        private int totalPnum;
        private List<ListBean> list;

        public int getPnum() {
            return pnum;
        }

        public void setPnum(int pnum) {
            this.pnum = pnum;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        public int getRecords() {
            return records;
        }

        public void setRecords(int records) {
            this.records = records;
        }

        public int getTotalPnum() {
            return totalPnum;
        }

        public void setTotalPnum(int totalPnum) {
            this.totalPnum = totalPnum;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * msg : 一定要听结尾曲！太好听了
             * phoneNumber : ㌍㌫㌶㍊㍍㍑㌫㌶㍍
             * dataId : ff8080815fa38f91015fb086ef376df8
             * userPic : http://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTK8ichLPACYaD80Y1SZSpqXeTaqYzgKcDaVa3GExDn1SicuQuHYBcJ7ER2HOXbZibkD3qwHQXnNRt3gg/0
             * time : 2017-11-12 21:59:13
             * likeNum : 0
             */

            private String msg;
            private String phoneNumber;
            private String dataId;
            private String userPic;
            private String time;
            private int likeNum;

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getLikeNum() {
                return likeNum;
            }

            public void setLikeNum(int likeNum) {
                this.likeNum = likeNum;
            }
        }
    }
}
