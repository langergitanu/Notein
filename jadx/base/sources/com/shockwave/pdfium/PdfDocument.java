package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class PdfDocument {
    long mNativeDocPtr;
    final Map<Integer, Long> mNativePagesPtr = new ArrayMap();
    ParcelFileDescriptor parcelFileDescriptor;

    public static class Bookmark {
        public List<Bookmark> children = new ArrayList();
        public long mNativePtr;
        public long pageIdx;
        public String title;

        public List<Bookmark> getChildren() {
            return this.children;
        }

        public long getPageIdx() {
            return this.pageIdx;
        }

        public String getTitle() {
            return this.title;
        }

        public boolean hasChildren() {
            return !this.children.isEmpty();
        }
    }

    public static class Link {
        private RectF bounds;
        private Integer destPageIdx;
        private long mNativePtr;
        private String uri;

        public Link(RectF rectF, Integer num, String str, long j) {
            this.bounds = rectF;
            this.destPageIdx = num;
            this.uri = str;
            this.mNativePtr = j;
        }

        public RectF getBounds() {
            return this.bounds;
        }

        public Integer getDestPageIdx() {
            return this.destPageIdx;
        }

        public long getNativePtr() {
            return this.mNativePtr;
        }

        public String getUri() {
            return this.uri;
        }
    }

    public static class Meta {
        String author;
        String creationDate;
        String creator;
        String keywords;
        String modDate;
        String producer;
        String subject;
        String title;

        public String getAuthor() {
            return this.author;
        }

        public String getCreationDate() {
            return this.creationDate;
        }

        public String getCreator() {
            return this.creator;
        }

        public String getKeywords() {
            return this.keywords;
        }

        public String getModDate() {
            return this.modDate;
        }

        public String getProducer() {
            return this.producer;
        }

        public String getSubject() {
            return this.subject;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public boolean hasPage(int i) {
        return this.mNativePagesPtr.containsKey(Integer.valueOf(i));
    }
}
