package models;

        public class FirstClass {
        private String titulo;
       // private String author;
       // private String venue;
      //  private String citacions;
       // private String year;

        public FirstClass(StringBuilder informa){}


            public FirstClass(
                String titulo
            /*    String author,
                String venue,
                String citacions,
                String year */
        ){
             this.titulo = titulo;
            /* this.author = author;
             this.venue = venue;
             this.citacions = citacions;
             this.year = year; */
        }

            public String getTitulo() {
                return titulo;
            }

            public void setTitulo(String titulo) {
                this.titulo = titulo;
            }

        /*    public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getVenue() {
                return venue;
            }

            public void setVenue(String venue) {
                this.venue = venue;
            }

            public String getCitacions() {
                return citacions;
            }

            public void setCitacions(String citacions) {
                this.citacions = citacions;
            }

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }
*/

        }
