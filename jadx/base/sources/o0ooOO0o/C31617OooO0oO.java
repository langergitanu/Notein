package o0ooOO0o;

import android.util.Log;
import com.aspose.slides.PatternStyle;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Stack;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0O.C31607OooO0O0;
import o0ooo0.AbstractC31720OooOOOo;
import o0ooo0o.AbstractC31763OooO0O0;
import o0ooo0o.C31762OooO00o;
import o0ooo0o.C31764OooO0OO;
import o0ooo0o.C31765OooO0Oo;
import o0oooO00.C31807OooOOOo;
import o0oooOO0.C31835OooO00o;
import o0oooOO0.C31838OooO0Oo;

/* JADX INFO: renamed from: o0ooOO0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31617OooO0oO implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ByteArrayOutputStream f113026OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31611OooO00o f113027OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31610OooO f113029OooOoO0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final NumberFormat f113033OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final byte[] f113034OooOooo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f113028OooOoO = false;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Stack<AbstractC31720OooOOOo> f113030OooOoOO = new Stack<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Stack<AbstractC31763OooO0O0> f113032OooOoo0 = new Stack<>();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Stack<AbstractC31763OooO0O0> f113031OooOoo = new Stack<>();

    public C31617OooO0oO(C31611OooO00o c31611OooO00o, C31807OooOOOo c31807OooOOOo, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.f113033OooOooO = numberInstance;
        this.f113034OooOooo = new byte[32];
        this.f113027OooOo0o = c31611OooO00o;
        this.f113026OooOo = byteArrayOutputStream;
        this.f113029OooOoO0 = c31807OooOOOo.OooO0OO();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    public static boolean OooOOO0(double d) {
        return d < 0.0d || d > 1.0d;
    }

    public final void OooO00o(float f, float f2, float f3, float f4) throws IOException {
        if (this.f113028OooOoO) {
            throw new IllegalStateException("Error: addRect is not allowed within a text block.");
        }
        Oooo0(f);
        Oooo0(f2);
        Oooo0(f3);
        Oooo0(f4);
        Oooo0OO("re");
    }

    public final C31441OooOO0 OooO0OO(AbstractC31763OooO0O0 abstractC31763OooO0O0) throws IOException {
        if ((abstractC31763OooO0O0 instanceof C31764OooO0OO) || (abstractC31763OooO0O0 instanceof C31765OooO0Oo)) {
            return C31441OooOO0.OooOooo(abstractC31763OooO0O0.OooO00o());
        }
        C31610OooO c31610OooO = this.f113029OooOoO0;
        c31610OooO.getClass();
        return c31610OooO.OooO00o(C31441OooOO0.f112433o00Ooo, TranslateLanguage.CZECH, abstractC31763OooO0O0);
    }

    public final void OooOOo0(float f, float f2) throws IOException {
        if (!this.f113028OooOoO) {
            throw new IllegalStateException("Error: must call beginText() before newLineAtOffset()");
        }
        Oooo0(f);
        Oooo0(f2);
        Oooo0OO("Td");
    }

    public final void OooOOoo(C31762OooO00o c31762OooO00o) throws IOException {
        Stack<AbstractC31763OooO0O0> stack = this.f113032OooOoo0;
        if (stack.isEmpty() || stack.peek() != c31762OooO00o.f113412OooO0OO) {
            OooO0OO(c31762OooO00o.f113412OooO0OO).Oooo00o(this.f113026OooOo);
            this.f113026OooOo.write(32);
            Oooo0OO(TranslateLanguage.CZECH);
            Oooo000(c31762OooO00o.f113412OooO0OO);
        }
        for (float f : c31762OooO00o.OooO00o()) {
            Oooo0(f);
        }
        Oooo0OO("sc");
    }

    public final void OooOooo() throws IOException {
        if (OooOOO0(0.0f)) {
            throw new IllegalArgumentException("Parameter must be within 0..1, but is 0.0");
        }
        Oooo0(0.0f);
        Oooo0OO("g");
        Oooo000(C31764OooO0OO.f113413OooOo0o);
    }

    public final void Oooo0(float f) throws IOException {
        NumberFormat numberFormat;
        int iOooO00o;
        int i;
        long j;
        int i2;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw new IllegalArgumentException(f + " is not a finite number");
        }
        NumberFormat numberFormat2 = this.f113033OooOooO;
        int maximumFractionDigits = numberFormat2.getMaximumFractionDigits();
        long[] jArr = C31838OooO0Oo.f113465OooO00o;
        if (Float.isNaN(f) || Float.isInfinite(f) || f > 9.223372E18f || f <= -9.223372E18f || maximumFractionDigits > 5) {
            numberFormat = numberFormat2;
            iOooO00o = -1;
        } else {
            long j2 = (long) f;
            byte[] bArr = this.f113034OooOooo;
            if (f < 0.0f) {
                bArr[0] = PatternStyle.DottedGrid;
                j2 = -j2;
                i = 1;
            } else {
                i = 0;
            }
            numberFormat = numberFormat2;
            double dAbs = Math.abs(f) - j2;
            long[] jArr2 = C31838OooO0Oo.f113465OooO00o;
            long j3 = j2;
            long j4 = jArr2[maximumFractionDigits];
            long j5 = (long) ((dAbs * j4) + 0.5d);
            if (j5 >= j4) {
                j = j3 + 1;
                j5 -= j4;
            } else {
                j = j3;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= 18) {
                    i2 = 18;
                    break;
                }
                int i4 = i3 + 1;
                if (j < jArr2[i4]) {
                    i2 = i3;
                    break;
                }
                i3 = i4;
            }
            iOooO00o = C31838OooO0Oo.OooO00o(j, bArr, i2, i, false);
            if (j5 > 0 && maximumFractionDigits > 0) {
                bArr[iOooO00o] = PatternStyle.Divot;
                iOooO00o = C31838OooO0Oo.OooO00o(j5, bArr, maximumFractionDigits - 1, iOooO00o + 1, true);
            }
        }
        if (iOooO00o == -1) {
            this.f113026OooOo.write(numberFormat.format(f).getBytes(C31835OooO00o.f113456OooO00o));
        } else {
            this.f113026OooOo.write(this.f113034OooOooo, 0, iOooO00o);
        }
        this.f113026OooOo.write(32);
    }

    public final void Oooo000(AbstractC31763OooO0O0 abstractC31763OooO0O0) {
        Stack<AbstractC31763OooO0O0> stack = this.f113032OooOoo0;
        if (stack.isEmpty()) {
            stack.add(abstractC31763OooO0O0);
        } else {
            stack.setElementAt(abstractC31763OooO0O0, stack.size() - 1);
        }
    }

    public final void Oooo00o(String str) throws IOException {
        if (!this.f113028OooOoO) {
            throw new IllegalStateException("Must call beginText() before showText()");
        }
        Stack<AbstractC31720OooOOOo> stack = this.f113030OooOoOO;
        if (stack.isEmpty()) {
            throw new IllegalStateException("Must call setFont() before showText()");
        }
        AbstractC31720OooOOOo abstractC31720OooOOOoPeek = stack.peek();
        if (abstractC31720OooOOOoPeek.OooOOo()) {
            int iCharCount = 0;
            while (iCharCount < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount);
                abstractC31720OooOOOoPeek.OooO0o0(iCodePointAt);
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        C31607OooO0O0.Oooo0(abstractC31720OooOOOoPeek.OooO0oO(str), this.f113026OooOo);
        this.f113026OooOo.write(" ".getBytes(C31835OooO00o.f113456OooO00o));
        Oooo0OO("Tj");
    }

    public final void Oooo0OO(String str) throws IOException {
        this.f113026OooOo.write(str.getBytes(C31835OooO00o.f113456OooO00o));
        this.f113026OooOo.write(10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f113028OooOoO) {
            Log.w("PdfBox-Android", "You did not call endText(), some viewers won't display your text");
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f113026OooOo;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
            this.f113026OooOo = null;
        }
    }
}
