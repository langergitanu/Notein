package o000O000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.OooO0OO;
import java.util.Iterator;
import java.util.Set;
import o000O000.C24385OooOO0o;
import o000OoO.C24533OooO00o;

/* JADX INFO: renamed from: o000O000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24382OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO.OooO0Oo f82259OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24385OooOO0o f82260OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24379OooO0Oo f82261OooO0OO;

    /* JADX INFO: renamed from: o000O000.OooO0oo$OooO00o */
    public static class OooO00o implements OooO0O0<C24386OooOOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C24386OooOOOo f82262OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0OO.OooO0Oo f82263OooO0O0;

        public OooO00o(C24386OooOOOo c24386OooOOOo, OooO0OO.OooO0Oo oooO0Oo) {
            this.f82262OooO00o = c24386OooOOOo;
            this.f82263OooO0O0 = oooO0Oo;
        }

        @Override // o000O000.C24382OooO0oo.OooO0O0
        public final boolean OooO00o(CharSequence charSequence, int i, int i2, OooOOO oooOOO) {
            if ((oooOOO.f82285OooO0OO & 4) > 0) {
                return true;
            }
            if (this.f82262OooO00o == null) {
                this.f82262OooO00o = new C24386OooOOOo(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f82263OooO0O0.getClass();
            this.f82262OooO00o.setSpan(new OooOOOO(oooOOO), i, i2, 33);
            return true;
        }

        @Override // o000O000.C24382OooO0oo.OooO0O0
        public final C24386OooOOOo getResult() {
            return this.f82262OooO00o;
        }
    }

    /* JADX INFO: renamed from: o000O000.OooO0oo$OooO0O0 */
    public interface OooO0O0<T> {
        boolean OooO00o(CharSequence charSequence, int i, int i2, OooOOO oooOOO);

        T getResult();
    }

    /* JADX INFO: renamed from: o000O000.OooO0oo$OooO0OO */
    public static class OooO0OO implements OooO0O0<OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f82264OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f82265OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f82266OooO0OO = -1;

        public OooO0OO(int i) {
            this.f82264OooO00o = i;
        }

        @Override // o000O000.C24382OooO0oo.OooO0O0
        public final boolean OooO00o(CharSequence charSequence, int i, int i2, OooOOO oooOOO) {
            int i3 = this.f82264OooO00o;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.f82265OooO0O0 = i;
            this.f82266OooO0OO = i2;
            return false;
        }

        @Override // o000O000.C24382OooO0oo.OooO0O0
        public final OooO0OO getResult() {
            return this;
        }
    }

    /* JADX INFO: renamed from: o000O000.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public static class C24383OooO0Oo implements OooO0O0<C24383OooO0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f82267OooO00o;

        public C24383OooO0Oo(String str) {
            this.f82267OooO00o = str;
        }

        @Override // o000O000.C24382OooO0oo.OooO0O0
        public final boolean OooO00o(CharSequence charSequence, int i, int i2, OooOOO oooOOO) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f82267OooO00o)) {
                return true;
            }
            oooOOO.f82285OooO0OO = (oooOOO.f82285OooO0OO & 3) | 4;
            return false;
        }

        @Override // o000O000.C24382OooO0oo.OooO0O0
        public final C24383OooO0Oo getResult() {
            return this;
        }
    }

    /* JADX INFO: renamed from: o000O000.OooO0oo$OooO0o0, reason: case insensitive filesystem */
    public static final class C24384OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f82268OooO00o = 1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24385OooOO0o.OooO00o f82269OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C24385OooOO0o.OooO00o f82270OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public C24385OooOO0o.OooO00o f82271OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f82272OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f82273OooO0o0;

        public C24384OooO0o0(C24385OooOO0o.OooO00o oooO00o) {
            this.f82269OooO0O0 = oooO00o;
            this.f82270OooO0OO = oooO00o;
        }

        public final void OooO00o() {
            this.f82268OooO00o = 1;
            this.f82270OooO0OO = this.f82269OooO0O0;
            this.f82272OooO0o = 0;
        }

        public final boolean OooO0O0() {
            C24533OooO00o c24533OooO00oOooO0O0 = this.f82270OooO0OO.f82281OooO0O0.OooO0O0();
            int iOooO00o = c24533OooO00oOooO0O0.OooO00o(6);
            return !(iOooO00o == 0 || c24533OooO00oOooO0O0.f82986OooO0O0.get(iOooO00o + c24533OooO00oOooO0O0.f82985OooO00o) == 0) || this.f82273OooO0o0 == 65039;
        }
    }

    public C24382OooO0oo(C24385OooOO0o c24385OooOO0o, OooO0OO.OooO0Oo oooO0Oo, C24379OooO0Oo c24379OooO0Oo, Set set) {
        this.f82259OooO00o = oooO0Oo;
        this.f82260OooO0O0 = c24385OooOO0o;
        this.f82261OooO0OO = c24379OooO0Oo;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            OooO0OO(str, 0, str.length(), 1, true, new C24383OooO0Oo(str));
        }
    }

    public static boolean OooO00o(Editable editable, KeyEvent keyEvent, boolean z) {
        OooO[] oooOArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (oooOArr = (OooO[]) editable.getSpans(selectionStart, selectionEnd, OooO.class)) != null && oooOArr.length > 0) {
                for (OooO oooO : oooOArr) {
                    int spanStart = editable.getSpanStart(oooO);
                    int spanEnd = editable.getSpanEnd(oooO);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean OooO0O0(CharSequence charSequence, int i, int i2, OooOOO oooOOO) {
        if ((oooOOO.f82285OooO0OO & 3) == 0) {
            C24379OooO0Oo c24379OooO0Oo = this.f82261OooO0OO;
            C24533OooO00o c24533OooO00oOooO0O0 = oooOOO.OooO0O0();
            int iOooO00o = c24533OooO00oOooO0O0.OooO00o(8);
            if (iOooO00o != 0) {
                c24533OooO00oOooO0O0.f82986OooO0O0.getShort(iOooO00o + c24533OooO00oOooO0O0.f82985OooO00o);
            }
            c24379OooO0Oo.getClass();
            ThreadLocal<StringBuilder> threadLocal = C24379OooO0Oo.f82253OooO0O0;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = PaintCompat.hasGlyph(c24379OooO0Oo.f82254OooO00o, sb.toString());
            int i3 = oooOOO.f82285OooO0OO & 4;
            oooOOO.f82285OooO0OO = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (oooOOO.f82285OooO0OO & 3) == 2;
    }

    public final <T> T OooO0OO(CharSequence charSequence, int i, int i2, int i3, boolean z, OooO0O0<T> oooO0O0) {
        int i4;
        char c;
        C24384OooO0o0 c24384OooO0o0 = new C24384OooO0o0(this.f82260OooO0O0.f82278OooO0OO);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        boolean zOooO00o = true;
        int i5 = 0;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zOooO00o) {
                SparseArray<C24385OooOO0o.OooO00o> sparseArray = c24384OooO0o0.f82270OooO0OO.f82280OooO00o;
                C24385OooOO0o.OooO00o oooO00o = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                if (c24384OooO0o0.f82268OooO00o == 2) {
                    if (oooO00o != null) {
                        c24384OooO0o0.f82270OooO0OO = oooO00o;
                        c24384OooO0o0.f82272OooO0o++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c24384OooO0o0.OooO00o();
                        } else if (iCodePointAt != 65039) {
                            C24385OooOO0o.OooO00o oooO00o2 = c24384OooO0o0.f82270OooO0OO;
                            if (oooO00o2.f82281OooO0O0 != null) {
                                if (c24384OooO0o0.f82272OooO0o != 1) {
                                    c24384OooO0o0.f82271OooO0Oo = oooO00o2;
                                    c24384OooO0o0.OooO00o();
                                } else if (c24384OooO0o0.OooO0O0()) {
                                    c24384OooO0o0.f82271OooO0Oo = c24384OooO0o0.f82270OooO0OO;
                                    c24384OooO0o0.OooO00o();
                                } else {
                                    c24384OooO0o0.OooO00o();
                                }
                                c = 3;
                            } else {
                                c24384OooO0o0.OooO00o();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (oooO00o == null) {
                    c24384OooO0o0.OooO00o();
                    c = 1;
                } else {
                    c24384OooO0o0.f82268OooO00o = 2;
                    c24384OooO0o0.f82270OooO0OO = oooO00o;
                    c24384OooO0o0.f82272OooO0o = 1;
                    c = 2;
                }
                c24384OooO0o0.f82273OooO0o0 = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !OooO0O0(charSequence, i4, iCharCount, c24384OooO0o0.f82271OooO0Oo.f82281OooO0O0)) {
                        zOooO00o = oooO0O0.OooO00o(charSequence, i4, iCharCount, c24384OooO0o0.f82271OooO0Oo.f82281OooO0O0);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (c24384OooO0o0.f82268OooO00o == 2 && c24384OooO0o0.f82270OooO0OO.f82281OooO0O0 != null && ((c24384OooO0o0.f82272OooO0o > 1 || c24384OooO0o0.OooO0O0()) && i5 < i3 && zOooO00o && (z || !OooO0O0(charSequence, i4, iCharCount, c24384OooO0o0.f82270OooO0OO.f82281OooO0O0)))) {
            oooO0O0.OooO00o(charSequence, i4, iCharCount, c24384OooO0o0.f82270OooO0OO.f82281OooO0O0);
        }
        return oooO0O0.getResult();
    }
}
