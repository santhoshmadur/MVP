package com.adobe.aem.desertwolves.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(
        adaptables = SlingHttpServletRequest.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class InfiniteCarouselModel {

    @ChildResource(name = "cards")
    private List<InfiniteCardsModel> cards;

    public List<InfiniteCardsModel> getCards() {
        return cards;
    }

    @Model(
            adaptables = Resource.class,
            defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
    )
    public static class InfiniteCardsModel {

        @ValueMapValue
        private String cardType;

        @ValueMapValue
        private String image;

        @ValueMapValue
        private String title;

        @ValueMapValue
        private String subTitle;

        public String getCardType() {
            return cardType;
        }

        public String getImage() {
            return image;
        }

        public String getTitle() {
            return title;
        }

        public String getSubTitle() {
            return subTitle;
        }
    }
}
