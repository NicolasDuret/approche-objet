package entites;

    public class Personne {
        String nom;
        String prenom;
        String address;

        public Personne(String nom, String prenom, String address) {
            this.nom = nom;
            this.prenom = prenom;
            this.address = address;}

            public void afficherPersonne(Personne personne){
                System.out.println(personne.prenom + " " + personne.nom.toUpperCase());
            }

            public void setNom(String nom) {
                this.nom = nom;
            }
            public void setPrenom(String prenom) {
                this.prenom = prenom;
            }
            public void setAdresse(String adresse) {
                this.address = adresse;
            }

            public String getNomPersonne(Personne personne){
                return personne.nom;
            }
            public String getPrenomPersonne(Personne personne){
                return personne.prenom;
            }
            public String getAdressePersonne(Personne personne){
                return personne.address;
            }



        }

