package com.project.shangruhuang.webcrawler;

public class WebCrawler {
    /**
     * Interface for crawling callback
     */
    interface CrawlingCallback {
        void onPageCrawlingCompleted();

        void onPageCrawlingFailed(String Url, int errorCode);

        void onCrawlingCompleted();
    }


}
