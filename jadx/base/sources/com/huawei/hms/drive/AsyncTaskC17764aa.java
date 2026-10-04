package com.huawei.hms.drive;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* JADX INFO: renamed from: com.huawei.hms.drive.aa */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC17764aa extends AsyncTask<Context, Integer, Boolean> {

    /* JADX INFO: renamed from: a */
    private static final String f52544a = "aa";

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) {
        InputStream inputStreamM76890a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            inputStreamM76890a = C17889x.m76890a(contextArr[0]);
        } catch (Exception e) {
            C17766ac.m75936d(f52544a, "doInBackground: exception : " + e.getMessage());
            inputStreamM76890a = null;
        }
        C17766ac.m75933a(f52544a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (inputStreamM76890a == null) {
            return Boolean.FALSE;
        }
        AbstractC17765ab.m75930a(inputStreamM76890a);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        C17766ac.m75933a(f52544a, "onPreExecute");
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            C17766ac.m75934b(f52544a, "onPostExecute: upate done");
        } else {
            C17766ac.m75936d(f52544a, "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        C17766ac.m75934b(f52544a, "onProgressUpdate");
    }
}
