public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' ->  new Adventure(title);
            case 'C' ->  new Comedy(title);
            case 'S' ->  new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
        /* The format specifier, %s, is used to replace any string which
        is not as commonly used as others I've shown you, but it will
        work well here. And %n puts a new line there.
        Now, this string gets repeated three times with this repeat method
        before the formatting takes place. This means that all these stage
        plots get printed, each on its own line.
         */
    }
    public void watchAdventure() {
        System.out.println("Watching an Adventure!");

    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");

    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad stuff",
                "Space Guys Chase Aliens",
                "Planet Blows up");

    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");

    }
}

