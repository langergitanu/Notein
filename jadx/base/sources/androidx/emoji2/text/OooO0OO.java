package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o000O000.C24379OooO0Oo;
import o000O000.C24382OooO0oo;
import o000O000.C24385OooOO0o;
import o000O000.C24386OooOOOo;
import o000O000.OooO;
import o000O000.OooOOO0;
import o000OoO.C24534OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f64705OooOO0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static volatile OooO0OO f64706OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C24379OooO0Oo f64707OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ReentrantReadWriteLock f64708OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo.OooO0O0 f64709OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile int f64710OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Handler f64711OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC21865OooO0oO f64712OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f64713OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0Oo f64714OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f64715OooO0oo;

    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile C24382OooO0oo f64716OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile C24385OooOO0o f64717OooO0OO;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f64718OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f64718OooO00o = oooO0OO;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static abstract class AbstractC19015OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC21865OooO0oO f64719OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f64720OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C24379OooO0Oo f64721OooO0OO = new C24379OooO0Oo();

        public AbstractC19015OooO0OO(InterfaceC21865OooO0oO interfaceC21865OooO0oO) {
            Preconditions.checkNotNull(interfaceC21865OooO0oO, "metadataLoader cannot be null.");
            this.f64719OooO00o = interfaceC21865OooO0oO;
        }
    }

    public static class OooO0Oo {
    }

    public static class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f64722OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayList f64723OooOo0o;

        public OooO0o(List list, int i, Throwable th) {
            Preconditions.checkNotNull(list, "initCallbacks cannot be null");
            this.f64723OooOo0o = new ArrayList(list);
            this.f64722OooOo = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f64723OooOo0o;
            int size = arrayList.size();
            int i = 0;
            if (this.f64722OooOo != 1) {
                while (i < size) {
                    ((AbstractC21864OooO0o0) arrayList.get(i)).OooO00o();
                    i++;
                }
            } else {
                while (i < size) {
                    ((AbstractC21864OooO0o0) arrayList.get(i)).OooO0O0();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC21864OooO0o0 {
        public void OooO00o() {
        }

        public void OooO0O0() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC21865OooO0oO {
        void OooO00o(AbstractC21866OooO0oo abstractC21866OooO0oo);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    public static abstract class AbstractC21866OooO0oo {
        public abstract void OooO00o(Throwable th);

        public abstract void OooO0O0(C24385OooOO0o c24385OooOO0o);
    }

    public OooO0OO(EmojiCompatInitializer.OooO00o oooO00o) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f64708OooO00o = reentrantReadWriteLock;
        this.f64710OooO0OO = 3;
        InterfaceC21865OooO0oO interfaceC21865OooO0oO = oooO00o.f64719OooO00o;
        this.f64712OooO0o = interfaceC21865OooO0oO;
        int i = oooO00o.f64720OooO0O0;
        this.f64715OooO0oo = i;
        this.f64707OooO = oooO00o.f64721OooO0OO;
        this.f64711OooO0Oo = new Handler(Looper.getMainLooper());
        this.f64709OooO0O0 = new OooOo.OooO0O0();
        this.f64714OooO0oO = new OooO0Oo();
        OooO00o oooO00o2 = new OooO00o(this);
        this.f64713OooO0o0 = oooO00o2;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f64710OooO0OO = 0;
            } catch (Throwable th) {
                this.f64708OooO00o.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (OooO0O0() == 0) {
            try {
                interfaceC21865OooO0oO.OooO00o(new androidx.emoji2.text.OooO0O0(oooO00o2));
            } catch (Throwable th2) {
                OooO0o0(th2);
            }
        }
    }

    public static OooO0OO OooO00o() {
        OooO0OO oooO0OO;
        synchronized (f64705OooOO0) {
            oooO0OO = f64706OooOO0O;
            Preconditions.checkState(oooO0OO != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return oooO0OO;
    }

    public static boolean OooO0OO() {
        return f64706OooOO0O != null;
    }

    public final int OooO0O0() {
        this.f64708OooO00o.readLock().lock();
        try {
            return this.f64710OooO0OO;
        } finally {
            this.f64708OooO00o.readLock().unlock();
        }
    }

    public final void OooO0Oo() {
        Preconditions.checkState(this.f64715OooO0oo == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (OooO0O0() == 1) {
            return;
        }
        this.f64708OooO00o.writeLock().lock();
        try {
            if (this.f64710OooO0OO == 0) {
                return;
            }
            this.f64710OooO0OO = 0;
            this.f64708OooO00o.writeLock().unlock();
            OooO00o oooO00o = this.f64713OooO0o0;
            OooO0OO oooO0OO = oooO00o.f64718OooO00o;
            try {
                oooO0OO.f64712OooO0o.OooO00o(new androidx.emoji2.text.OooO0O0(oooO00o));
            } catch (Throwable th) {
                oooO0OO.OooO0o0(th);
            }
        } finally {
            this.f64708OooO00o.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[Catch: all -> 0x0093, TRY_ENTER, TryCatch #1 {all -> 0x0093, blocks: (B:30:0x006b, B:33:0x0070, B:35:0x0074, B:37:0x0081, B:44:0x00a0, B:46:0x00aa, B:48:0x00ad, B:50:0x00b0, B:52:0x00c0, B:53:0x00c3), top: B:83:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:30:0x006b, B:33:0x0070, B:35:0x0074, B:37:0x0081, B:44:0x00a0, B:46:0x00aa, B:48:0x00ad, B:50:0x00b0, B:52:0x00c0, B:53:0x00c3), top: B:83:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2 A[Catch: all -> 0x0105, TRY_ENTER, TryCatch #2 {all -> 0x0105, blocks: (B:57:0x00d2, B:60:0x00da, B:42:0x0096), top: B:85:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence OooO0o(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        OooO[] oooOArr;
        Preconditions.checkState(OooO0O0() == 1, "Not initialized yet");
        Preconditions.checkArgumentNonnegative(i, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(i2, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(Integer.MAX_VALUE, "maxEmojiCount cannot be negative");
        Preconditions.checkArgument(i <= i2, "start should be <= than end");
        C24386OooOOOo c24386OooOOOo = null;
        if (charSequence == null) {
            return null;
        }
        Preconditions.checkArgument(i <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C24382OooO0oo c24382OooO0oo = this.f64713OooO0o0.f64716OooO0O0;
        c24382OooO0oo.getClass();
        boolean z = charSequence instanceof OooOOO0;
        if (z) {
            ((OooOOO0) charSequence).OooO00o();
        }
        if (z) {
            c24386OooOOOo = new C24386OooOOOo((Spannable) charSequence);
            if (c24386OooOOOo != null) {
            }
            i3 = i;
            i4 = i2;
            if (i3 == i4) {
            }
            ((OooOOO0) charSequence2).OooO0O0();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, OooO.class) <= i2) {
                    c24386OooOOOo = new C24386OooOOOo();
                    c24386OooOOOo.f82292OooOo0o = false;
                    c24386OooOOOo.f82291OooOo = new SpannableString(charSequence);
                }
                if (c24386OooOOOo != null) {
                    while (i < r5) {
                    }
                }
                i3 = i;
                i4 = i2;
                if (i3 == i4) {
                    charSequence2 = charSequence;
                    if (!z) {
                    }
                }
                ((OooOOO0) charSequence2).OooO0O0();
                return charSequence2;
            }
            try {
                c24386OooOOOo = new C24386OooOOOo((Spannable) charSequence);
                if (c24386OooOOOo != null && (oooOArr = (OooO[]) c24386OooOOOo.f82291OooOo.getSpans(i, i2, OooO.class)) != null && oooOArr.length > 0) {
                    for (OooO oooO : oooOArr) {
                        int spanStart = c24386OooOOOo.f82291OooOo.getSpanStart(oooO);
                        int spanEnd = c24386OooOOOo.f82291OooOo.getSpanEnd(oooO);
                        if (spanStart != i2) {
                            c24386OooOOOo.removeSpan(oooO);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                i3 = i;
                i4 = i2;
                if (i3 == i4 || i3 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        C24386OooOOOo c24386OooOOOo2 = (C24386OooOOOo) c24382OooO0oo.OooO0OO(charSequence2, i3, i4, Integer.MAX_VALUE, false, new C24382OooO0oo.OooO00o(c24386OooOOOo, c24382OooO0oo.f82259OooO00o));
                        if (c24386OooOOOo2 != null) {
                            Spannable spannable = c24386OooOOOo2.f82291OooOo;
                            if (z) {
                                ((OooOOO0) charSequence2).OooO0O0();
                            }
                            return spannable;
                        }
                        if (!z) {
                            return charSequence2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                        }
                    }
                }
                ((OooOOO0) charSequence2).OooO0O0();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((OooOOO0) charSequence2).OooO0O0();
        throw th;
    }

    public final void OooO0o0(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f64708OooO00o.writeLock().lock();
        try {
            this.f64710OooO0OO = 2;
            arrayList.addAll(this.f64709OooO0O0);
            this.f64709OooO0O0.clear();
            this.f64708OooO00o.writeLock().unlock();
            this.f64711OooO0Oo.post(new OooO0o(arrayList, this.f64710OooO0OO, th));
        } catch (Throwable th2) {
            this.f64708OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    public final void OooO0oO(AbstractC21864OooO0o0 abstractC21864OooO0o0) {
        Preconditions.checkNotNull(abstractC21864OooO0o0, "initCallback cannot be null");
        this.f64708OooO00o.writeLock().lock();
        try {
            if (this.f64710OooO0OO == 1 || this.f64710OooO0OO == 2) {
                this.f64711OooO0Oo.post(new OooO0o(Arrays.asList((AbstractC21864OooO0o0) Preconditions.checkNotNull(abstractC21864OooO0o0, "initCallback cannot be null")), this.f64710OooO0OO, null));
            } else {
                this.f64709OooO0O0.add(abstractC21864OooO0o0);
            }
            this.f64708OooO00o.writeLock().unlock();
        } catch (Throwable th) {
            this.f64708OooO00o.writeLock().unlock();
            throw th;
        }
    }

    public final void OooO0oo(EditorInfo editorInfo) {
        if (OooO0O0() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        OooO00o oooO00o = this.f64713OooO0o0;
        oooO00o.getClass();
        Bundle bundle = editorInfo.extras;
        C24534OooO0O0 c24534OooO0O0 = oooO00o.f64717OooO0OO.f82276OooO00o;
        int iOooO00o = c24534OooO0O0.OooO00o(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iOooO00o != 0 ? c24534OooO0O0.f82986OooO0O0.getInt(iOooO00o + c24534OooO0O0.f82985OooO00o) : 0);
        Bundle bundle2 = editorInfo.extras;
        oooO00o.f64718OooO00o.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
