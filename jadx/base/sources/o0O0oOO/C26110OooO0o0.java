package o0O0oOO;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o0O0oOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26110OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile C26110OooO0o0 f89141OooO00o;

    /* JADX INFO: renamed from: o0O0oOO.OooO0o0$OooO00o */
    public enum OooO00o {
        /* JADX INFO: Fake field, exist only in values array */
        USER_CLICK("用户点击"),
        LOAD_START("load()开始"),
        DECODE_START("解码开始"),
        DECODE_END("解码结束"),
        LOAD_COMPLETE("loadComplete"),
        /* JADX INFO: Fake field, exist only in values array */
        RENDER_START("渲染开始"),
        /* JADX INFO: Fake field, exist only in values array */
        PAGE_OPEN_START("openPage开始"),
        /* JADX INFO: Fake field, exist only in values array */
        STROKES_LOAD_START("笔画加载开始"),
        /* JADX INFO: Fake field, exist only in values array */
        STROKES_LOAD_END("笔画加载结束"),
        /* JADX INFO: Fake field, exist only in values array */
        PAGE_OPEN_END("openPage结束"),
        /* JADX INFO: Fake field, exist only in values array */
        FIRST_FRAME("首帧可见");

        OooO00o(String str) {
        }
    }

    public C26110OooO0o0() {
        new ConcurrentHashMap();
    }

    public static C26110OooO0o0 OooO00o() {
        if (f89141OooO00o == null) {
            synchronized (C26110OooO0o0.class) {
                try {
                    if (f89141OooO00o == null) {
                        f89141OooO00o = new C26110OooO0o0();
                    }
                } finally {
                }
            }
        }
        return f89141OooO00o;
    }

    public static boolean OooO0O0() {
        OooO00o().getClass();
        return false;
    }

    public static void OooO0OO(OooO00o oooO00o) {
        OooO00o().getClass();
    }
}
