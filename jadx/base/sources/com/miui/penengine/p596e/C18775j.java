package com.miui.penengine.p596e;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.KeyEvent;
import androidx.datastore.preferences.protobuf.o000oOoO;
import com.miui.penengine.p594c.C18759b;
import com.miui.penengine.touchfilm.MiuiTouchFilmUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.miui.penengine.e.j */
/* JADX INFO: loaded from: classes9.dex */
public class C18775j {

    /* JADX INFO: renamed from: g */
    public static final String f57248g = "j";

    /* JADX INFO: renamed from: h */
    public static final int f57249h = 194;

    /* JADX INFO: renamed from: i */
    public static final int f57250i = 195;

    /* JADX INFO: renamed from: j */
    public static final int f57251j = 196;

    /* JADX INFO: renamed from: k */
    public static final int f57252k = 197;

    /* JADX INFO: renamed from: l */
    public static final Set<Integer> f57253l;

    /* JADX INFO: renamed from: m */
    public static final String f57254m = "stylus_pinch_status";

    /* JADX INFO: renamed from: n */
    public static final String f57255n = "stylus_hover_enable";

    /* JADX INFO: renamed from: o */
    public static final String f57256o = "stylus_double_click_status";

    /* JADX INFO: renamed from: p */
    public static final String f57257p = "stylus_brush_preview_enable";

    /* JADX INFO: renamed from: q */
    public static final int f57258q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f57259r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f57260s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f57261t = 1;

    /* JADX INFO: renamed from: a */
    public ContentResolver f57262a;

    /* JADX INFO: renamed from: b */
    public a f57263b;

    /* JADX INFO: renamed from: c */
    public MiuiTouchFilmUtils.TouchFilmListener f57264c;

    /* JADX INFO: renamed from: d */
    public int f57265d = 0;

    /* JADX INFO: renamed from: e */
    public int f57266e = 1;

    /* JADX INFO: renamed from: f */
    public boolean f57267f;

    /* JADX INFO: renamed from: com.miui.penengine.e.j$a */
    public class a extends ContentObserver {
        public a(Looper looper) {
            super(new Handler(looper));
        }

        /* JADX INFO: renamed from: a */
        public void m80367a() {
            C18775j.this.f57262a.unregisterContentObserver(this);
        }

        /* JADX INFO: renamed from: b */
        public void m80368b() {
            C18775j.this.f57262a.registerContentObserver(Settings.System.getUriFor(C18775j.f57254m), false, this);
            C18775j.this.f57262a.registerContentObserver(Settings.System.getUriFor(C18775j.f57256o), false, this);
            C18775j.this.f57262a.registerContentObserver(Settings.System.getUriFor(C18775j.f57255n), false, this);
            C18775j.this.f57262a.registerContentObserver(Settings.System.getUriFor(C18775j.f57257p), false, this);
            onChange(false, Settings.System.getUriFor(C18775j.f57254m));
            onChange(false, Settings.System.getUriFor(C18775j.f57256o));
            onChange(false, Settings.System.getUriFor(C18775j.f57255n));
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            String str;
            StringBuilder sb;
            int i;
            super.onChange(z, uri);
            if (Settings.System.getUriFor(C18775j.f57256o).equals(uri)) {
                C18775j c18775j = C18775j.this;
                c18775j.f57266e = Settings.System.getInt(c18775j.f57262a, C18775j.f57256o, 1);
                str = C18775j.f57248g;
                sb = new StringBuilder("Update stylus double click status, status = ");
                i = C18775j.this.f57266e;
            } else {
                if (!Settings.System.getUriFor(C18775j.f57254m).equals(uri)) {
                    if (!Settings.System.getUriFor(C18775j.f57255n).equals(uri) && !Settings.System.getUriFor(C18775j.f57257p).equals(uri)) {
                        C18759b.m80277c(C18775j.f57248g, "Uri does not match any settings key");
                        return;
                    }
                    int i2 = Settings.System.getInt(C18775j.this.f57262a, C18775j.f57255n, 1);
                    int i3 = Settings.System.getInt(C18775j.this.f57262a, C18775j.f57257p, 1);
                    boolean z2 = (i2 == 0 || i3 == 0) ? false : true;
                    C18759b.m80277c(C18775j.f57248g, "Update stylus brush or hover status, hover = " + i2 + ", brush preview = " + i3);
                    MiuiTouchFilmUtils.TouchFilmListener touchFilmListener = C18775j.this.f57264c;
                    if (touchFilmListener != null) {
                        touchFilmListener.onBrushPreviewChanged(z2);
                        return;
                    }
                    return;
                }
                C18775j c18775j2 = C18775j.this;
                c18775j2.f57265d = Settings.System.getInt(c18775j2.f57262a, C18775j.f57254m, 0);
                str = C18775j.f57248g;
                sb = new StringBuilder("Update stylus pinch status, status = ");
                i = C18775j.this.f57265d;
            }
            sb.append(i);
            C18759b.m80277c(str, sb.toString());
        }
    }

    static {
        Object[] objArr = {194, 195, 196, 197};
        HashSet hashSet = new HashSet(4);
        for (int i = 0; i < 4; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "duplicate element: "));
            }
        }
        f57253l = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: b */
    public void m80366b() {
        a aVar = this.f57263b;
        if (aVar == null || this.f57264c == null || this.f57262a == null) {
            return;
        }
        aVar.m80367a();
        this.f57264c = null;
        this.f57263b = null;
        this.f57262a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m80364a(Context context, MiuiTouchFilmUtils.TouchFilmListener touchFilmListener) {
        if (context == null) {
            C18759b.m80279e(f57248g, "Context in null");
            return;
        }
        this.f57264c = touchFilmListener;
        this.f57262a = context.getContentResolver();
        a aVar = new a(context.getMainLooper());
        this.f57263b = aVar;
        aVar.m80368b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[PHI: r0 r4
      0x0044: PHI (r0v3 int) = (r0v1 int), (r0v5 int) binds: [B:37:0x005e, B:24:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r4v2 com.miui.penengine.touchfilm.MiuiTouchFilmUtils$TouchFilmListener) = 
      (r4v0 com.miui.penengine.touchfilm.MiuiTouchFilmUtils$TouchFilmListener)
      (r4v3 com.miui.penengine.touchfilm.MiuiTouchFilmUtils$TouchFilmListener)
     binds: [B:37:0x005e, B:24:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m80365a(KeyEvent keyEvent) {
        int i;
        MiuiTouchFilmUtils.TouchFilmListener touchFilmListener;
        String str;
        String str2;
        MiuiTouchFilmUtils.TouchFilmListener touchFilmListener2;
        int i2;
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        int i3 = 0;
        if (!f57253l.contains(Integer.valueOf(keyCode))) {
            return false;
        }
        switch (keyCode) {
            case 194:
                i = this.f57265d;
                if (i == 0) {
                    str = f57248g;
                    str2 = "Stylus pinch is disabled";
                    C18759b.m80279e(str, str2);
                    return true;
                }
                touchFilmListener = this.f57264c;
                if (touchFilmListener == null || action != 0 || this.f57267f) {
                    if (action == 1) {
                        this.f57267f = false;
                    }
                    return true;
                }
                this.f57267f = true;
                if (i <= 4) {
                    i3 = i;
                }
                touchFilmListener.onTouchFilmTriggered(i3);
                return true;
            case 195:
                i = this.f57266e;
                if (i == 0) {
                    str = f57248g;
                    str2 = "Stylus double tap is disabled";
                    C18759b.m80279e(str, str2);
                    return true;
                }
                touchFilmListener = this.f57264c;
                if (touchFilmListener != null && action == 0) {
                    if (i <= 4) {
                    }
                    touchFilmListener.onTouchFilmTriggered(i3);
                }
                return true;
            case 196:
                touchFilmListener2 = this.f57264c;
                if (touchFilmListener2 != null && action == 0) {
                    i2 = 5;
                    touchFilmListener2.onTouchFilmTriggered(i2);
                }
                return true;
            case 197:
                touchFilmListener2 = this.f57264c;
                if (touchFilmListener2 != null && action == 0) {
                    i2 = 6;
                    touchFilmListener2.onTouchFilmTriggered(i2);
                }
                return true;
            default:
                return true;
        }
    }
}
