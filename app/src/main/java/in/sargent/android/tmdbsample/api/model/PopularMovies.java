package in.sargent.android.tmdbsample.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sargentin on 07/11/2017.
 */

public class PopularMovies {

    /**
     * page : 1
     * total_results : 19811
     * total_pages : 991
     * movies : [{"vote_count":3404,"id":346364,"video":false,"vote_average":7.3,"title":"It","popularity":783.997954,"poster_path":"/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg","original_language":"en","original_title":"It","genres":[18,27,53],"backdrop_path":"/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg","adult":false,"overview":"In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.","release_date":"2017-09-05"},{"vote_count":1029,"id":284053,"video":false,"vote_average":7.7,"title":"Thor: Ragnarok","popularity":747.768912,"poster_path":"/oSLd5GYGsiGgzDPKTwQh7wamO8t.jpg","original_language":"en","original_title":"Thor: Ragnarok","genres":[28,12,35,14,878],"backdrop_path":"/wBzMnQ01R9w58W6ucltdYfOyP4j.jpg","adult":false,"overview":"Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.","release_date":"2017-10-25"},{"vote_count":4951,"id":211672,"video":false,"vote_average":6.4,"title":"Minions","popularity":557.736378,"poster_path":"/q0R4crx2SehcEEQEkYObktdeFy.jpg","original_language":"en","original_title":"Minions","genres":[10751,16,12,35],"backdrop_path":"/uX7LXnsC7bZJZjn048UCOwkPXWJ.jpg","adult":false,"overview":"Minions Stuart, Kevin and Bob are recruited by Scarlet Overkill, a super-villain who, alongside her inventor husband Herb, hatches a plot to take over the world.","release_date":"2015-06-17"},{"vote_count":199,"id":440021,"video":false,"vote_average":6.5,"title":"Happy Death Day","popularity":531.45039,"poster_path":"/cTaEIUYTt52ooq9quVbAQ7NpGwo.jpg","original_language":"en","original_title":"Happy Death Day","genres":[27,9648,53],"backdrop_path":"/eGx5OfOdvM0gkHdmkLe3hcJuEIT.jpg","adult":false,"overview":"A college student relives the day of her murder over and over again as she tries to discover her killer's identity.","release_date":"2017-10-12"},{"vote_count":1536,"id":335984,"video":false,"vote_average":7.5,"title":"Blade Runner 2049","popularity":431.304877,"poster_path":"/aMpyrCizvSdc0UIMblJ1srVgAEF.jpg","original_language":"en","original_title":"Blade Runner 2049","genres":[28,9648,878,53],"backdrop_path":"/mVr0UiqyltcfqxbAUcLl9zWL8ah.jpg","adult":false,"overview":"Thirty years after the events of the first film, a new blade runner, LAPD Officer K, unearths a long-buried secret that has the potential to plunge what's left of society into chaos. K's discovery leads him on a quest to find Rick Deckard, a former LAPD blade runner who has been missing for 30 years.","release_date":"2017-10-04"},{"vote_count":87,"id":347882,"video":false,"vote_average":5.7,"title":"Sleight","popularity":413.128941,"poster_path":"/wridRvGxDqGldhzAIh3IcZhHT5F.jpg","original_language":"en","original_title":"Sleight","genres":[18,53,28,878],"backdrop_path":"/2SEgJ0mHJ7TSdVDbkGU061tR33K.jpg","adult":false,"overview":"A young street magician is left to take care of his little sister after his mother's passing and turns to drug dealing in the Los Angeles party scene to keep a roof over their heads. When he gets into trouble with his supplier, his sister is kidnapped and he is forced to rely on both his sleight of hand and brilliant mind to save her.","release_date":"2017-04-28"},{"vote_count":2183,"id":281338,"video":false,"vote_average":6.8,"title":"War for the Planet of the Apes","popularity":403.243711,"poster_path":"/3vYhLLxrTtZLysXtIWktmd57Snv.jpg","original_language":"en","original_title":"War for the Planet of the Apes","genres":[18,878,10752],"backdrop_path":"/ulMscezy9YX0bhknvJbZoUgQxO5.jpg","adult":false,"overview":"Caesar and his apes are forced into a deadly conflict with an army of humans led by a ruthless Colonel. After the apes suffer unimaginable losses, Caesar wrestles with his darker instincts and begins his own mythic quest to avenge his kind. As the journey finally brings them face to face, Caesar and the Colonel are pitted against each other in an epic battle that will determine the fate of both their species and the future of the planet.","release_date":"2017-07-11"},{"vote_count":140,"id":298250,"video":false,"vote_average":5.9,"title":"Jigsaw","popularity":367.522411,"poster_path":"/zUbUtxiTdEgWnkXY945gtYYqBZ1.jpg","original_language":"en","original_title":"Jigsaw","genres":[27,53],"backdrop_path":"/ytKpFaLMpFWnuSXStz1GHrtTt6R.jpg","adult":false,"overview":"Dead bodies begin to turn up all over the city, each meeting their demise in a variety of grisly ways. All investigations begin to point the finger at deceased killer John Kramer.","release_date":"2017-10-20"},{"vote_count":194,"id":274855,"video":false,"vote_average":5.9,"title":"Geostorm","popularity":356.01465,"poster_path":"/nrsx0jEaBgXq4PWo7SooSnYJTv.jpg","original_language":"en","original_title":"Geostorm","genres":[28,878,53],"backdrop_path":"/lhTtnsPmEYUJB7nOaTKJzYoxJ7X.jpg","adult":false,"overview":"Gerard Butler playing a stubborn but charming satellite designer who, when the world\u2019s climate-controlling satellites malfunction, has to work together with his estranged brother to save the world from a man-made storm of epic proportions. A trip into space follows, while on Earth a plot to assassinate the president begins to unfold.","release_date":"2017-10-13"},{"vote_count":6494,"id":177572,"video":false,"vote_average":7.8,"title":"Big Hero 6","popularity":334.269263,"poster_path":"/9gLu47Zw5ertuFTZaxXOvNfy78T.jpg","original_language":"en","original_title":"Big Hero 6","genres":[12,10751,16,28,35],"backdrop_path":"/2BXd0t9JdVqCp9sKf6kzMkr7QjB.jpg","adult":false,"overview":"The special bond that develops between plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who team up with a group of friends to form a band of high-tech heroes.","release_date":"2014-10-24"},{"vote_count":92,"id":390062,"video":false,"vote_average":5.4,"title":"Jungle","popularity":324.154828,"poster_path":"/tDgxknTVwrScxpCYyGUjXSn5NRk.jpg","original_language":"en","original_title":"Jungle","genres":[12,18,53],"backdrop_path":"/go1a6YwrVTMrNNIfaRpBRp5pIzV.jpg","adult":false,"overview":"A mysterious guide escorts an enthusiastic adventurer and his friend into the Amazon jungle, but their journey turns into a terrifying ordeal as the darkest elements of human nature and the deadliest threats of the wild force them to fight for survival.","release_date":"2017-10-20"},{"vote_count":5815,"id":321612,"video":false,"vote_average":6.8,"title":"Beauty and the Beast","popularity":299.644837,"poster_path":"/tWqifoYuwLETmmasnGHO7xBjEtt.jpg","original_language":"en","original_title":"Beauty and the Beast","genres":[10751,14,10749],"backdrop_path":"/6aUWe0GSl69wMTSWWexsorMIvwU.jpg","adult":false,"overview":"A live-action adaptation of Disney's version of the classic 'Beauty and the Beast' tale of a cursed prince and a beautiful young woman who helps him break the spell.","release_date":"2017-03-16"},{"vote_count":4375,"id":315635,"video":false,"vote_average":7.3,"title":"Spider-Man: Homecoming","popularity":297.705508,"poster_path":"/kY2c7wKgOfQjvbqe7yVzLTYkxJO.jpg","original_language":"en","original_title":"Spider-Man: Homecoming","genres":[28,12,35,878],"backdrop_path":"/vc8bCGjdVp0UbMNLzHnHSLRbBWQ.jpg","adult":false,"overview":"Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.","release_date":"2017-07-05"},{"vote_count":383,"id":337170,"video":false,"vote_average":6.3,"title":"American Made","popularity":293.415998,"poster_path":"/8dTWj3c74RDhXfSUZpuyVNJrgS.jpg","original_language":"en","original_title":"American Made","genres":[35,28,80,53],"backdrop_path":"/jcKzxRGYiXuS7ctTHLdw9wH8d7V.jpg","adult":false,"overview":"The true story of pilot Barry Seal, who transported contraband for the CIA and the Medellin cartel in the 1980s.","release_date":"2017-08-17"},{"vote_count":5670,"id":245891,"video":false,"vote_average":7,"title":"John Wick","popularity":262.435789,"poster_path":"/5vHssUeVe25bMrof1HyaPyWgaP.jpg","original_language":"en","original_title":"John Wick","genres":[28,53],"backdrop_path":"/umC04Cozevu8nn3JTDJ1pc7PVTn.jpg","adult":false,"overview":"Ex-hitman John Wick comes out of retirement to track down the gangsters that took everything from him.","release_date":"2014-10-22"},{"vote_count":6232,"id":210577,"video":false,"vote_average":7.9,"title":"Gone Girl","popularity":260.093762,"poster_path":"/gdiLTof3rbPDAmPaCf4g6op46bj.jpg","original_language":"en","original_title":"Gone Girl","genres":[9648,53,18],"backdrop_path":"/bt6DhdALyhf90gReozoQ0y3R3vZ.jpg","adult":false,"overview":"With his wife's disappearance having become the focus of an intense media circus, a man sees the spotlight turned on him when it's suspected that he may not be innocent.","release_date":"2014-10-01"},{"vote_count":6013,"id":131631,"video":false,"vote_average":6.6,"title":"The Hunger Games: Mockingjay - Part 1","popularity":257.628506,"poster_path":"/gj282Pniaa78ZJfbaixyLXnXEDI.jpg","original_language":"en","original_title":"The Hunger Games: Mockingjay - Part 1","genres":[878,12,53],"backdrop_path":"/4PwyB0ErucIANzW24Kori71J6gU.jpg","adult":false,"overview":"Katniss Everdeen reluctantly becomes the symbol of a mass rebellion against the autocratic Capitol.","release_date":"2014-11-18"},{"vote_count":5558,"id":297762,"video":false,"vote_average":7.2,"title":"Wonder Woman","popularity":255.090344,"poster_path":"/imekS7f1OuHyUP2LAiTEM0zBzUz.jpg","original_language":"en","original_title":"Wonder Woman","genres":[28,12,14],"backdrop_path":"/6iUNJZymJBMXXriQyFZfLAKnjO6.jpg","adult":false,"overview":"An Amazon princess comes to the world of Man to become the greatest of the female superheroes.","release_date":"2017-05-30"},{"vote_count":129,"id":372343,"video":false,"vote_average":5.1,"title":"The Snowman","popularity":230.487844,"poster_path":"/bQHgpTVsAWjNQWS0frsl7DlzLX1.jpg","original_language":"en","original_title":"The Snowman","genres":[80,18,27,9648,53],"backdrop_path":"/tAg6KUBANIVbYUpTHy5oKibhhw3.jpg","adult":false,"overview":"Detective Harry Hole investigates the disappearance of a woman whose pink scarf is found wrapped around an ominous looking snowman.","release_date":"2017-10-12"},{"vote_count":8985,"id":680,"video":false,"vote_average":8.3,"title":"Pulp Fiction","popularity":224.502027,"poster_path":"/dM2w364MScsjFf8pfMbaWUcWrR.jpg","original_language":"en","original_title":"Pulp Fiction","genres":[53,80],"backdrop_path":"/9rZg1J6vMQoDVSgRyWcpJa8IAGy.jpg","adult":false,"overview":"A burger-loving hit man, his philosophical partner, a drug-addled gangster's moll and a washed-up boxer converge in this sprawling, comedic crime caper. Their adventures unfurl in three stories that ingeniously trip back and forth in time.","release_date":"1994-09-10"}]
     */

    private int page;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("results")
    private List<Movie> movies;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
