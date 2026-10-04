package com.microsoft.identity.common.java.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public final class HttpUrlConnectionFactory {
    private static Queue<HttpURLConnection> sMockedConnectionQueue = new LinkedList();

    private HttpUrlConnectionFactory() {
    }

    public static void addMockedConnection(HttpURLConnection httpURLConnection) {
        sMockedConnectionQueue.add(httpURLConnection);
    }

    public static void clearMockedConnectionQueue() {
        sMockedConnectionQueue.clear();
    }

    public static HttpURLConnection createHttpURLConnection(URL url) throws IOException {
        return !sMockedConnectionQueue.isEmpty() ? sMockedConnectionQueue.poll() : (HttpURLConnection) url.openConnection();
    }

    public static int getMockedConnectionCountInQueue() {
        return sMockedConnectionQueue.size();
    }
}
