package com.huawei.hms.network.embedded;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18124c0 {

    /* JADX INFO: renamed from: e */
    public static final String f54350e = "DispatcherMessage";

    /* JADX INFO: renamed from: a */
    public Handler f54351a = null;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<Integer, AbstractC18179g> f54352b;

    /* JADX INFO: renamed from: c */
    public List<Integer> f54353c;

    /* JADX INFO: renamed from: d */
    public HandlerThread f54354d;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.c0$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                AbstractC18179g abstractC18179g = (AbstractC18179g) C18124c0.this.f54352b.get(Integer.valueOf(message.what));
                if (abstractC18179g == null) {
                    Logger.m76963i(C18124c0.f54350e, "please register firstly");
                    return;
                }
                Logger.m76965v(C18124c0.f54350e, "the handler message will obtain, what =" + message.what);
                abstractC18179g.mo78517a(message.obj);
            } catch (RuntimeException unused) {
                Logger.m76963i(C18124c0.f54350e, "the handler has exception!");
            } catch (Throwable th) {
                HianalyticsHelper.getInstance().reportException(th, "crash");
            }
        }
    }

    public C18124c0() {
        ConcurrentHashMap<Integer, AbstractC18179g> concurrentHashMap = new ConcurrentHashMap<>();
        this.f54352b = concurrentHashMap;
        this.f54353c = Collections.unmodifiableList(new ArrayList(Arrays.asList(1001)));
        HandlerThread handlerThread = new HandlerThread("netdiag_thread");
        this.f54354d = handlerThread;
        handlerThread.start();
        concurrentHashMap.put(1003, C18193h.m78641b());
        concurrentHashMap.put(1002, C18207i.m78741b());
        concurrentHashMap.put(1001, C18221j.m78830c());
    }

    /* JADX INFO: renamed from: b */
    private synchronized Handler m78034b() {
        Handler handler = this.f54351a;
        if (handler != null) {
            return handler;
        }
        Looper looper = this.f54354d.getLooper();
        if (looper == null) {
            return null;
        }
        a aVar = new a(looper);
        this.f54351a = aVar;
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78035a() {
        m78039a(this.f54353c);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m78040b(Message message) {
        try {
            if (m78034b() != null) {
                m78034b().sendMessage(message);
            } else {
                Logger.m76963i(f54350e, "hander is null,this time will abort!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78036a(int i) {
        this.f54352b.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m78037a(int i, AbstractC18179g abstractC18179g) {
        this.f54352b.put(Integer.valueOf(i), abstractC18179g);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78038a(Message message) {
        try {
            if (m78034b() != null) {
                m78034b().sendMessage(message);
            } else {
                Logger.m76963i(f54350e, "hander is null,this time will abort!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78039a(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Message messageObtain = Message.obtain();
            messageObtain.what = list.get(i).intValue();
            m78040b(messageObtain);
        }
    }
}
