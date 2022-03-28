public class Game {
    // this class contains a name, city and game type with getters and setters for each and a constructor
    private String name;
    private String city;
    private String gameType;

    public Game(String name, String city, String gameType) {
        this.name = name;
        this.city = city;
        this.gameType = gameType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    // main method to test the Game class
    public static void main(String[] args) {
        Game game = new Game("Dota 2", "London", "Online");
        System.out.println(game.getName());
        System.out.println(game.getCity());
        System.out.println(game.getGameType());
    }

}
