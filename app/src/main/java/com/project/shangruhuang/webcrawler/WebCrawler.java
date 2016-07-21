package com.project.shangruhuang.webcrawler;

import android.content.Context;

import java.util.HashSet;
import java.util.concurrent.BlockingQueue;

public class WebCrawler {
    /**
     * Interface for crawling callback
     */
    interface CrawlingCallback {
        void onPageCrawlingCompleted();

        void onPageCrawlingFailed(String Url, int errorCode);

        void onCrawlingCompleted();
    }

    private Context mContext;
    // SQLiteOpenHelper object for handling crawling database
    private CrawlerDB mCrawlerDB;
    // Set containing already visited URls
    private HashSet<String> crawledURL;
    // Queue for unvisited URL
    BlockingQueue<String> uncrawledURL;
    // For parallel crawling execution using ThreadPoolExecuter
    RunnableManager mManager;
    // Callback interface object to notify UI
    CrawlingCallback callback;
    // For sync of crawled and yet to crawl url lists
    Object lock;

    private class RunnableManager {
    }
}
