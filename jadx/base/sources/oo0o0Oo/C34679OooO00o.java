package oo0o0Oo;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOoOO.C20519OooO0Oo;
import OooooO0.C21291OooO0oO;
import OooooO0.C21294OooOO0O;
import OooooOO.AbstractC21341OoooOO0;
import OooooOO.C21325OooOooo;
import OooooOO.C21328Oooo000;
import OooooOO.C21362o00oO0o;
import OooooOO.InterfaceC21342OoooOOO;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.android.billingclient.api.C22189OoooO0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o00000O.C24104OooO0Oo;
import o00000O.C24105OooO0o0;
import o00000O.OooO0OO;
import o00000Oo.C24112OooO0O0;
import o00000o0.C24116OooO0Oo;
import o00000o0.C24117OooO0o0;
import o00000o0.C24119OooO0oo;
import o00000o0.EnumC24118OooO0oO;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24240OooOOOO;
import o000OOo.C24506OooO00o;
import o0O0O00.C25868OooOooo;
import o0O0O00.C25869Oooo00O;
import o0O0O00.C25870Oooo00o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.EnumC32441OooOO0O;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oo0o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34679OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24104OooO0Oo f124878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f124879OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f124880OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25869Oooo00O f124881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f124882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CharSequence f124883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f124884OooO0oO;

    /* JADX INFO: renamed from: oo0o0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20370OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C24506OooO00o> {
        public C20370OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C24506OooO00o invoke() {
            C34679OooO00o c34679OooO00o = C34679OooO00o.this;
            Locale textLocale = c34679OooO00o.f124878OooO00o.f81219OooO0oO.getTextLocale();
            kotlin.jvm.internal.OooOOO0.OooO0o(textLocale, "paragraphIntrinsics.textPaint.textLocale");
            return new C24506OooO00o(textLocale, c34679OooO00o.f124881OooO0Oo.OooO0oo());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C34679OooO00o(C24104OooO0Oo c24104OooO0Oo, int i, boolean z, long j) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C24112OooO0O0[] brushSpans;
        Object obj;
        C21291OooO0oO c21291OooO0oO;
        float fOooO0Oo;
        this.f124878OooO00o = c24104OooO0Oo;
        this.f124879OooO0O0 = i;
        this.f124880OooO0OO = j;
        if (C24227OooO00o.OooO(j) != 0 || C24227OooO00o.OooOO0(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        C34698OooOo00 c34698OooOo00 = c24104OooO0Oo.f81214OooO0O0;
        CharSequence charSequence = c24104OooO0Oo.f81220OooO0oo;
        CharSequence charSequence2 = charSequence;
        if (z) {
            charSequence2 = charSequence;
            if (!C24240OooOOOO.OooO00o(c34698OooOo00.f124982OooO00o.f124950OooO0oo, C22189OoooO0.OooO0OO(0))) {
                charSequence2 = charSequence;
                if (!C24240OooOOOO.OooO00o(c34698OooOo00.f124982OooO00o.f124950OooO0oo, C24240OooOOOO.f81497OooO0O0)) {
                    C24119OooO0oo c24119OooO0oo = c34698OooOo00.f124983OooO0O0.f124929OooO00o;
                    charSequence2 = charSequence;
                    if (c24119OooO0oo != null) {
                        int i8 = c24119OooO0oo.f81274OooO00o;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        if (i8 != 5 && i8 != 4) {
                            int length = charSequence.length();
                            charSequence2 = charSequence;
                            if (length != 0) {
                                Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                                o00000OO.OooO0OO.OooO0Oo(spannableString, new o000000.OooO0OO(), spannableString.length() - 1, spannableString.length() - 1);
                                charSequence2 = spannableString;
                            }
                        }
                    }
                }
            }
        }
        this.f124883OooO0o0 = charSequence2;
        C34686OooO0oo c34686OooO0oo = c34698OooOo00.f124983OooO0O0;
        C24119OooO0oo c24119OooO0oo2 = c34686OooO0oo.f124929OooO00o;
        int i9 = 3;
        int i10 = (c24119OooO0oo2 != null && c24119OooO0oo2.f81274OooO00o == 1) ? 3 : (c24119OooO0oo2 != null && c24119OooO0oo2.f81274OooO00o == 2) ? 4 : (c24119OooO0oo2 != null && c24119OooO0oo2.f81274OooO00o == 3) ? 2 : ((c24119OooO0oo2 != null && c24119OooO0oo2.f81274OooO00o == 5) || c24119OooO0oo2 == null || c24119OooO0oo2.f81274OooO00o != 6) ? 0 : 1;
        int i11 = (c24119OooO0oo2 != null && c24119OooO0oo2.f81274OooO00o == 4) ? 1 : 0;
        C24116OooO0Oo c24116OooO0Oo = c34686OooO0oo.f124936OooO0oo;
        if (c24116OooO0Oo == null || c24116OooO0Oo.f81260OooO00o != 2) {
            i2 = i10;
            i3 = i11;
            i4 = 0;
        } else if (Build.VERSION.SDK_INT <= 32) {
            i2 = i10;
            i3 = i11;
            i4 = 1;
        } else {
            i2 = i10;
            i3 = i11;
            i4 = 3;
        }
        C24117OooO0o0 c24117OooO0o0 = c34686OooO0oo.f124935OooO0oO;
        C24117OooO0o0.OooO00o oooO00o = c24117OooO0o0 != null ? new C24117OooO0o0.OooO00o(c24117OooO0o0.f81267OooO00o & 255) : null;
        if (oooO00o != null && oooO00o.f81268OooO00o == 1) {
            i5 = 0;
        } else if (oooO00o != null && oooO00o.f81268OooO00o == 2) {
            i5 = 1;
        } else if (oooO00o != null && oooO00o.f81268OooO00o == 3) {
            i5 = 2;
        }
        C24117OooO0o0.OooO0O0 oooO0O0 = c24117OooO0o0 != null ? new C24117OooO0o0.OooO0O0((c24117OooO0o0.f81267OooO00o >> 8) & 255) : null;
        if (oooO0O0 != null && oooO0O0.f81269OooO00o == 1) {
            i9 = 0;
        } else if (oooO0O0 != null && oooO0O0.f81269OooO00o == 2) {
            i9 = 1;
        } else if (oooO0O0 != null && oooO0O0.f81269OooO00o == 3) {
            i9 = 2;
        } else if (oooO0O0 == null || oooO0O0.f81269OooO00o != 4) {
        }
        C24117OooO0o0.OooO0OO oooO0OO = c24117OooO0o0 != null ? new C24117OooO0o0.OooO0OO((c24117OooO0o0.f81267OooO00o >> 16) & 255) : null;
        if ((oooO0OO != null && oooO0OO.f81270OooO00o == 1) || oooO0OO == null || oooO0OO.f81270OooO00o != 2) {
            i6 = i2;
            i7 = 0;
        } else {
            i6 = i2;
            i7 = 1;
        }
        TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
        int i12 = i9;
        int i13 = i5;
        C25869Oooo00O c25869Oooo00OOooO00o = OooO00o(i6, i3, truncateAt, i, i4, i13, i12, i7);
        if (!z || c25869Oooo00OOooO00o.OooO00o() <= C24227OooO00o.OooO0oO(j) || i <= 1) {
            this.f124881OooO0Oo = c25869Oooo00OOooO00o;
        } else {
            int iOooO0oO = C24227OooO00o.OooO0oO(j);
            int i14 = 0;
            while (true) {
                int i15 = c25869Oooo00OOooO00o.f88260OooO0o0;
                if (i14 >= i15) {
                    i14 = i15;
                    break;
                } else if (c25869Oooo00OOooO00o.OooO0Oo(i14) > iOooO0oO) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 >= 0 && i14 != this.f124879OooO0O0) {
                c25869Oooo00OOooO00o = OooO00o(i6, i3, truncateAt, i14 < 1 ? 1 : i14, i4, i13, i12, i7);
            }
            this.f124881OooO0Oo = c25869Oooo00OOooO00o;
        }
        C24104OooO0Oo c24104OooO0Oo2 = this.f124878OooO00o;
        C34691OooOOO0 c34691OooOOO0 = c34698OooOo00.f124982OooO00o;
        c24104OooO0Oo2.f81219OooO0oO.OooO00o(c34691OooOOO0.f124943OooO00o.getBrush(), C21294OooOO0O.OooO00o(OooO0o(), OooO0OO()), c34691OooOOO0.f124943OooO00o.getAlpha());
        C25869Oooo00O c25869Oooo00O = this.f124881OooO0Oo;
        if (c25869Oooo00O.OooO0oo() instanceof Spanned) {
            brushSpans = (C24112OooO0O0[]) ((Spanned) c25869Oooo00O.OooO0oo()).getSpans(0, c25869Oooo00O.OooO0oo().length(), C24112OooO0O0.class);
            kotlin.jvm.internal.OooOOO0.OooO0o(brushSpans, "brushSpans");
            if (brushSpans.length == 0) {
                brushSpans = new C24112OooO0O0[0];
            }
        } else {
            brushSpans = new C24112OooO0O0[0];
        }
        for (C24112OooO0O0 c24112OooO0O0 : brushSpans) {
            c24112OooO0O0.f81253OooOoO0 = C21294OooOO0O.OooO00o(OooO0o(), OooO0OO());
        }
        CharSequence charSequence3 = this.f124883OooO0o0;
        if (charSequence3 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence3;
            Object[] spans = spanned.getSpans(0, charSequence3.length(), o000000.OooO.class);
            kotlin.jvm.internal.OooOOO0.OooO0o(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj2 : spans) {
                o000000.OooO oooO = (o000000.OooO) obj2;
                int spanStart = spanned.getSpanStart(oooO);
                int spanEnd = spanned.getSpanEnd(oooO);
                int lineForOffset = this.f124881OooO0Oo.f88258OooO0Oo.getLineForOffset(spanStart);
                boolean z2 = lineForOffset >= this.f124879OooO0O0;
                boolean z3 = this.f124881OooO0Oo.f88258OooO0Oo.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f124881OooO0Oo.f88258OooO0Oo.getEllipsisStart(lineForOffset);
                Layout layout = this.f124881OooO0Oo.f88258OooO0Oo;
                boolean z4 = spanEnd > (layout.getEllipsisStart(lineForOffset) == 0 ? layout.getLineEnd(lineForOffset) : layout.getText().length());
                if (z3 || z4 || z2) {
                    c21291OooO0oO = null;
                } else {
                    int iOrdinal = OooO0O0(spanStart).ordinal();
                    if (iOrdinal == 0) {
                        fOooO0Oo = OooO0Oo(spanStart, true);
                    } else {
                        if (iOrdinal != 1) {
                            throw new C32442OooOO0o();
                        }
                        float fOooO0Oo2 = OooO0Oo(spanStart, true);
                        if (!oooO.f81130OooOoO) {
                            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                        }
                        fOooO0Oo = fOooO0Oo2 - oooO.f81128OooOo;
                    }
                    if (!oooO.f81130OooOoO) {
                        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
                    }
                    float fOooO0OO = this.f124881OooO0Oo.OooO0OO(lineForOffset) - oooO.OooO0O0();
                    c21291OooO0oO = new C21291OooO0oO(fOooO0Oo, fOooO0OO, oooO.f81128OooOo + fOooO0Oo, oooO.OooO0O0() + fOooO0OO);
                }
                arrayList.add(c21291OooO0oO);
            }
            obj = arrayList;
        } else {
            obj = C34434OooOoO.f123453OooOo0o;
        }
        this.f124882OooO0o = obj;
        this.f124884OooO0oO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C20370OooO00o());
    }

    public final C25869Oooo00O OooO00o(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        float fOooO0o = OooO0o();
        C24104OooO0Oo c24104OooO0Oo = this.f124878OooO00o;
        OooO0OO.OooO00o oooO00o = o00000O.OooO0OO.f81211OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c24104OooO0Oo.f81214OooO0O0, "<this>");
        return new C25869Oooo00O(this.f124883OooO0o0, fOooO0o, c24104OooO0Oo.f81219OooO0oO, i, truncateAt, c24104OooO0Oo.f81223OooOO0o, true, i3, i5, i6, i7, i4, i2, c24104OooO0Oo.f81212OooO);
    }

    public final EnumC24118OooO0oO OooO0O0(int i) {
        return this.f124881OooO0Oo.f88258OooO0Oo.isRtlCharAt(i) ? EnumC24118OooO0oO.f81271OooOo : EnumC24118OooO0oO.f81272OooOo0o;
    }

    public final float OooO0OO() {
        return this.f124881OooO0Oo.OooO00o();
    }

    public final float OooO0Oo(int i, boolean z) {
        C25869Oooo00O c25869Oooo00O = this.f124881OooO0Oo;
        return z ? c25869Oooo00O.OooO0o(i, false) : c25869Oooo00O.OooO0oO(i, false);
    }

    public final float OooO0o() {
        return C24227OooO00o.OooO0oo(this.f124880OooO0OO);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<OooooO0.OooO0oO>] */
    public final List<C21291OooO0oO> OooO0o0() {
        return this.f124882OooO0o;
    }

    public final void OooO0oO(InterfaceC21342OoooOOO interfaceC21342OoooOOO) {
        Canvas canvas = C21328Oooo000.f61738OooO00o;
        Canvas canvas2 = ((C21325OooOooo) interfaceC21342OoooOOO).f61733OooO00o;
        C25869Oooo00O c25869Oooo00O = this.f124881OooO0Oo;
        if (c25869Oooo00O.f88257OooO0OO) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, OooO0o(), OooO0OO());
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas2, "canvas");
        if (canvas2.getClipBounds(c25869Oooo00O.f88266OooOOO)) {
            int i = c25869Oooo00O.f88259OooO0o;
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            C25868OooOooo c25868OooOooo = C25870Oooo00o.f88269OooO00o;
            c25868OooOooo.getClass();
            c25868OooOooo.f88252OooO00o = canvas2;
            c25869Oooo00O.f88258OooO0Oo.draw(c25868OooOooo);
            if (i != 0) {
                canvas2.translate(0.0f, (-1) * i);
            }
        }
        if (c25869Oooo00O.f88257OooO0OO) {
            canvas2.restore();
        }
    }

    public final void OooO0oo(InterfaceC21342OoooOOO interfaceC21342OoooOOO, AbstractC21341OoooOO0 abstractC21341OoooOO0, float f, C21362o00oO0o c21362o00oO0o, o00000o0.OooO oooO, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        C24105OooO0o0 c24105OooO0o0 = this.f124878OooO00o.f81219OooO0oO;
        int i = c24105OooO0o0.f81228OooO00o.f61741OooO0O0;
        c24105OooO0o0.OooO00o(abstractC21341OoooOO0, C21294OooOO0O.OooO00o(OooO0o(), OooO0OO()), f);
        c24105OooO0o0.OooO0OO(c21362o00oO0o);
        c24105OooO0o0.OooO0Oo(oooO);
        c24105OooO0o0.OooO0O0(abstractC20449OooO0Oo);
        c24105OooO0o0.f81228OooO00o.OooOO0O(3);
        OooO0oO(interfaceC21342OoooOOO);
        c24105OooO0o0.f81228OooO00o.OooOO0O(i);
    }
}
