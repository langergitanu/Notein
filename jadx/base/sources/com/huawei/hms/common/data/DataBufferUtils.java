package com.huawei.hms.common.data;

import android.os.Bundle;
import com.google.firebase.firestore.Query;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class DataBufferUtils {
    public static final int ARGS_BUNDLE = 4;
    public static final int ARGS_COLUMN = 1;
    public static final int ARGS_CURSOR = 2;
    public static final int ARGS_STATUS = 3;
    public static final int ARGS_VERSION = 1000;
    public static final String NEXT_PAGE = "next_page";
    public static final String PREV_PAGE = "prev_page";

    private DataBufferUtils() {
    }

    private static boolean containKey(Bundle bundle, String str) {
        return (bundle == null || bundle.getString(str) == null) ? false : true;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> dataBuffer) {
        Query.C170491 c170491 = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        Iterator<E> it = dataBuffer.iterator();
        while (it.hasNext()) {
            c170491.add(it.next().freeze());
        }
        dataBuffer.release();
        return c170491;
    }

    public static boolean hasData(DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(DataBuffer<?> dataBuffer) {
        return containKey(dataBuffer.getMetadata(), NEXT_PAGE);
    }

    public static boolean hasPrevPage(DataBuffer<?> dataBuffer) {
        return containKey(dataBuffer.getMetadata(), PREV_PAGE);
    }
}
