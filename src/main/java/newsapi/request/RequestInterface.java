package newsapi.request;

import newsapi.objects.Country;
import newsapi.objects.NewsCategory;

public interface RequestInterface {

    String getArticles(final String source);

    String getSources();


//    String getArticles(final String source, final SortingMethod sortingMethod);

    String getSources(final NewsCategory newsCategory);
    String getSources(final Country country);
    String getSources(final NewsCategory newsCategory, final Country country);




}
