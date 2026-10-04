package o0ooOO0;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21362o00oO0o;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import com.android.billingclient.api.C22189OoooO0;
import java.util.ArrayList;
import java.util.List;
import o000000o.C24091OooOOOo;
import o000000o.C24093OooOOo0;
import o00000o0.C24113OooO00o;
import o00000o0.C24120OooOO0o;
import o0000Ooo.C24240OooOOOO;
import o0000Ooo.C24241OooOOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34691OooOOO0;

/* JADX INFO: renamed from: o0ooOO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31508OooOO0 implements InterfaceC31551OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClipboardManager f112692OooO00o;

    public C31508OooOO0(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f112692OooO00o = (ClipboardManager) systemService;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // o0ooOO0.InterfaceC31551OooooOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(C34680OooO0O0 c34680OooO0O0) {
        List<C34680OooO0O0.C20372OooO0O0<C34691OooOOO0>> list = C34434OooOoO.f123453OooOo0o;
        List<C34680OooO0O0.C20372OooO0O0<C34691OooOOO0>> list2 = c34680OooO0O0.f124886OooOo;
        boolean zIsEmpty = (list2 == null ? list : list2).isEmpty();
        CharSequence charSequence = c34680OooO0O0.f124887OooOo0o;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            C31599o00o0O c31599o00o0O = new C31599o00o0O();
            Parcel parcelObtain = Parcel.obtain();
            kotlin.jvm.internal.OooOOO0.OooO0o(parcelObtain, "obtain()");
            c31599o00o0O.f112903OooO00o = parcelObtain;
            if (list2 != null) {
                list = list2;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C34680OooO0O0.C20372OooO0O0<C34691OooOOO0> c20372OooO0O0 = list.get(i);
                C34691OooOOO0 spanStyle = c20372OooO0O0.f124898OooO00o;
                c31599o00o0O.f112903OooO00o.recycle();
                Parcel parcelObtain2 = Parcel.obtain();
                kotlin.jvm.internal.OooOOO0.OooO0o(parcelObtain2, "obtain()");
                c31599o00o0O.f112903OooO00o = parcelObtain2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(spanStyle, "spanStyle");
                o00000o0.OooOO0O oooOO0O = spanStyle.f124943OooO00o;
                long jOooO00o = oooOO0O.OooO00o();
                long j = C21348Ooooo0o.f61766OooO0oO;
                byte b = 1;
                if (!C21348Ooooo0o.OooO0OO(jOooO00o, j)) {
                    c31599o00o0O.OooO00o((byte) 1);
                    c31599o00o0O.f112903OooO00o.writeLong(oooOO0O.OooO00o());
                }
                long j2 = C24240OooOOOO.f81497OooO0O0;
                long j3 = spanStyle.f124944OooO0O0;
                byte b2 = 2;
                if (!C24240OooOOOO.OooO00o(j3, j2)) {
                    c31599o00o0O.OooO00o((byte) 2);
                    c31599o00o0O.OooO0OO(j3);
                }
                C24093OooOOo0 c24093OooOOo0 = spanStyle.f124945OooO0OO;
                if (c24093OooOOo0 != null) {
                    c31599o00o0O.OooO00o((byte) 3);
                    c31599o00o0O.f112903OooO00o.writeInt(c24093OooOOo0.f81193OooOo0o);
                }
                o000000o.OooOOOO oooOOOO = spanStyle.f124946OooO0Oo;
                if (oooOOOO != null) {
                    c31599o00o0O.OooO00o((byte) 4);
                    int i2 = oooOOOO.f81185OooO00o;
                    c31599o00o0O.OooO00o((i2 != 0 && i2 == 1) ? (byte) 1 : (byte) 0);
                }
                C24091OooOOOo c24091OooOOOo = spanStyle.f124948OooO0o0;
                if (c24091OooOOOo != null) {
                    c31599o00o0O.OooO00o((byte) 5);
                    int i3 = c24091OooOOOo.f81186OooO00o;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                b2 = 3;
                                if (i3 != 3) {
                                    b = 0;
                                }
                            }
                            b = b2;
                        }
                        c31599o00o0O.OooO00o(b);
                    }
                }
                String str = spanStyle.f124949OooO0oO;
                if (str != null) {
                    c31599o00o0O.OooO00o((byte) 6);
                    c31599o00o0O.f112903OooO00o.writeString(str);
                }
                long j4 = spanStyle.f124950OooO0oo;
                if (!C24240OooOOOO.OooO00o(j4, j2)) {
                    c31599o00o0O.OooO00o((byte) 7);
                    c31599o00o0O.OooO0OO(j4);
                }
                C24113OooO00o c24113OooO00o = spanStyle.f124942OooO;
                if (c24113OooO00o != null) {
                    c31599o00o0O.OooO00o((byte) 8);
                    c31599o00o0O.OooO0O0(c24113OooO00o.f81258OooO00o);
                }
                C24120OooOO0o c24120OooOO0o = spanStyle.f124951OooOO0;
                if (c24120OooOO0o != null) {
                    c31599o00o0O.OooO00o((byte) 9);
                    c31599o00o0O.OooO0O0(c24120OooOO0o.f81280OooO00o);
                    c31599o00o0O.OooO0O0(c24120OooOO0o.f81281OooO0O0);
                }
                long j5 = spanStyle.f124953OooOO0o;
                if (!C21348Ooooo0o.OooO0OO(j5, j)) {
                    c31599o00o0O.OooO00o((byte) 10);
                    c31599o00o0O.f112903OooO00o.writeLong(j5);
                }
                o00000o0.OooO oooO = spanStyle.f124955OooOOO0;
                if (oooO != null) {
                    c31599o00o0O.OooO00o((byte) 11);
                    c31599o00o0O.f112903OooO00o.writeInt(oooO.f81257OooO00o);
                }
                C21362o00oO0o c21362o00oO0o = spanStyle.f124954OooOOO;
                if (c21362o00oO0o != null) {
                    c31599o00o0O.OooO00o((byte) 12);
                    c31599o00o0O.f112903OooO00o.writeLong(c21362o00oO0o.f61781OooO00o);
                    long j6 = c21362o00oO0o.f61782OooO0O0;
                    c31599o00o0O.OooO0O0(C21290OooO0o0.OooO0OO(j6));
                    c31599o00o0O.OooO0O0(C21290OooO0o0.OooO0Oo(j6));
                    c31599o00o0O.OooO0O0(c21362o00oO0o.f61783OooO0OO);
                }
                String strEncodeToString = Base64.encodeToString(c31599o00o0O.f112903OooO00o.marshall(), 0);
                kotlin.jvm.internal.OooOOO0.OooO0o(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", strEncodeToString), c20372OooO0O0.f124899OooO0O0, c20372OooO0O0.f124900OooO0OO, 33);
            }
            charSequence = spannableString;
        }
        this.f112692OooO00o.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [o000000o.OooOOOO] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [o000000o.OooOOOo] */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [o00000o0.OooO00o] */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [o00000o0.OooOO0o] */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v15 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [o00000o0.OooO] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11 */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [OooooOO.o00oO0o] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6 */
    @Override // o0ooOO0.InterfaceC31551OooooOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C34680OooO0O0 getText() {
        C24093OooOOo0 c24093OooOOo0;
        byte b;
        int i;
        Spanned spanned;
        ?? c24120OooOO0o;
        ?? c24113OooO00o;
        ?? string;
        ?? c24091OooOOOo;
        ?? oooO;
        byte b2 = 2;
        byte b3 = 1;
        ClipData primaryClip = this.f112692OooO00o.getPrimaryClip();
        C24093OooOOo0 c24093OooOOo02 = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            int i2 = 0;
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (!(text instanceof Spanned)) {
                    return new C34680OooO0O0(6, text.toString(), null);
                }
                Spanned spanned2 = (Spanned) text;
                Annotation[] annotations = (Annotation[]) spanned2.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                kotlin.jvm.internal.OooOOO0.OooO0o(annotations, "annotations");
                int length = annotations.length - 1;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        Annotation annotation = annotations[i3];
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned2.getSpanStart(annotation);
                            int spanEnd = spanned2.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            c24093OooOOo0 = c24093OooOOo02;
                            kotlin.jvm.internal.OooOOO0.OooO0o(value, "span.value");
                            Parcel parcelObtain = Parcel.obtain();
                            kotlin.jvm.internal.OooOOO0.OooO0o(parcelObtain, "obtain()");
                            byte[] bArrDecode = Base64.decode(value, i2);
                            parcelObtain.unmarshall(bArrDecode, i2, bArrDecode.length);
                            parcelObtain.setDataPosition(i2);
                            C24093OooOOo0 c24093OooOOo03 = c24093OooOOo0;
                            ?? oooOOOO = c24093OooOOo03;
                            ?? r28 = oooOOOO;
                            ?? r30 = r28;
                            ?? r33 = r30;
                            ?? r34 = r33;
                            ?? r38 = r34;
                            ?? c21362o00oO0o = r38;
                            long j = C21348Ooooo0o.f61766OooO0oO;
                            long j2 = j;
                            long jOooO0o0 = C24240OooOOOO.f81497OooO0O0;
                            long jOooO0o02 = jOooO0o0;
                            while (parcelObtain.dataAvail() > b3) {
                                byte b4 = parcelObtain.readByte();
                                if (b4 != b3) {
                                    i = i2;
                                    spanned = spanned2;
                                    if (b4 != b2) {
                                        int i4 = 3;
                                        if (b4 != 3) {
                                            if (b4 == 4) {
                                                b3 = 1;
                                                if (parcelObtain.dataAvail() >= 1) {
                                                    byte b5 = parcelObtain.readByte();
                                                    oooOOOO = new o000000o.OooOOOO((b5 != 0 && b5 == 1) ? 1 : i);
                                                    i2 = i;
                                                    spanned2 = spanned;
                                                    b2 = 2;
                                                }
                                            } else if (b4 != 5) {
                                                if (b4 == 6) {
                                                    c24091OooOOOo = r28;
                                                    string = parcelObtain.readString();
                                                    c24113OooO00o = r33;
                                                    c24120OooOO0o = r34;
                                                } else if (b4 == 7) {
                                                    if (parcelObtain.dataAvail() >= 5) {
                                                        byte b6 = parcelObtain.readByte();
                                                        long j3 = b6 == 1 ? 4294967296L : b6 == 2 ? 8589934592L : 0L;
                                                        jOooO0o02 = C24241OooOOOo.OooO00o(j3, 0L) ? C24240OooOOOO.f81497OooO0O0 : C22189OoooO0.OooO0o0(parcelObtain.readFloat(), j3);
                                                        c24091OooOOOo = r28;
                                                        string = r30;
                                                        c24113OooO00o = r33;
                                                        c24120OooOO0o = r34;
                                                    }
                                                } else if (b4 == 8) {
                                                    if (parcelObtain.dataAvail() >= 4) {
                                                        c24113OooO00o = new C24113OooO00o(parcelObtain.readFloat());
                                                        c24091OooOOOo = r28;
                                                        string = r30;
                                                        c24120OooOO0o = r34;
                                                    }
                                                } else if (b4 == 9) {
                                                    if (parcelObtain.dataAvail() >= 8) {
                                                        c24120OooOO0o = new C24120OooOO0o(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                        c24091OooOOOo = r28;
                                                        string = r30;
                                                        c24113OooO00o = r33;
                                                    }
                                                } else if (b4 != 10) {
                                                    if (b4 != 11) {
                                                        b = 2;
                                                        oooO = r38;
                                                        if (b4 == 12) {
                                                            if (parcelObtain.dataAvail() < 20) {
                                                                break;
                                                            }
                                                            long j4 = parcelObtain.readLong();
                                                            int i5 = C21348Ooooo0o.f61767OooO0oo;
                                                            i2 = i;
                                                            spanned2 = spanned;
                                                            b2 = 2;
                                                            c21362o00oO0o = new C21362o00oO0o(j4, C21289OooO0o.OooO00o(parcelObtain.readFloat(), parcelObtain.readFloat()), parcelObtain.readFloat());
                                                            r28 = r28;
                                                            r30 = r30;
                                                            r33 = r33;
                                                            r34 = r34;
                                                            r38 = r38;
                                                        }
                                                        b3 = 1;
                                                    } else if (parcelObtain.dataAvail() >= 4) {
                                                        int i6 = parcelObtain.readInt();
                                                        b = 2;
                                                        int i7 = (i6 & 2) != 0 ? 1 : i;
                                                        int i8 = (i6 & 1) != 0 ? 1 : i;
                                                        o00000o0.OooO oooO2 = o00000o0.OooO.f81256OooO0Oo;
                                                        o00000o0.OooO oooO3 = o00000o0.OooO.f81255OooO0OO;
                                                        if (i7 == 0 || i8 == 0) {
                                                            oooO = i7 != 0 ? oooO2 : i8 != 0 ? oooO3 : o00000o0.OooO.f81254OooO0O0;
                                                        } else {
                                                            List listOooOO0o = C34429OooOOo0.OooOO0o(oooO2, oooO3);
                                                            Integer numValueOf = Integer.valueOf(i);
                                                            int size = listOooOO0o.size();
                                                            for (int i9 = i; i9 < size; i9++) {
                                                                numValueOf = Integer.valueOf(numValueOf.intValue() | ((o00000o0.OooO) listOooOO0o.get(i9)).f81257OooO00o);
                                                            }
                                                            oooO = new o00000o0.OooO(numValueOf.intValue());
                                                        }
                                                    }
                                                    i2 = i;
                                                    spanned2 = spanned;
                                                    b2 = b;
                                                    r28 = r28;
                                                    r30 = r30;
                                                    r33 = r33;
                                                    r34 = r34;
                                                    r38 = oooO;
                                                    c21362o00oO0o = c21362o00oO0o;
                                                    b3 = 1;
                                                } else if (parcelObtain.dataAvail() >= 8) {
                                                    j2 = parcelObtain.readLong();
                                                    int i10 = C21348Ooooo0o.f61767OooO0oo;
                                                    c24091OooOOOo = r28;
                                                    string = r30;
                                                    c24113OooO00o = r33;
                                                    c24120OooOO0o = r34;
                                                }
                                                i2 = i;
                                                spanned2 = spanned;
                                                b2 = 2;
                                                r28 = c24091OooOOOo;
                                                r30 = string;
                                                r33 = c24113OooO00o;
                                                r34 = c24120OooOO0o;
                                                r38 = r38;
                                                c21362o00oO0o = c21362o00oO0o;
                                                b3 = 1;
                                            } else if (parcelObtain.dataAvail() >= 1) {
                                                byte b7 = parcelObtain.readByte();
                                                if (b7 != 0) {
                                                    if (b7 == 1) {
                                                        i4 = 1;
                                                    } else if (b7 != 3) {
                                                        i4 = b7 == 2 ? 2 : i;
                                                    }
                                                    c24091OooOOOo = new C24091OooOOOo(i4);
                                                    string = r30;
                                                    c24113OooO00o = r33;
                                                    c24120OooOO0o = r34;
                                                    i2 = i;
                                                    spanned2 = spanned;
                                                    b2 = 2;
                                                    r28 = c24091OooOOOo;
                                                    r30 = string;
                                                    r33 = c24113OooO00o;
                                                    r34 = c24120OooOO0o;
                                                    r38 = r38;
                                                    c21362o00oO0o = c21362o00oO0o;
                                                    b3 = 1;
                                                }
                                            }
                                            b = 2;
                                            break;
                                        }
                                        if (parcelObtain.dataAvail() < 4) {
                                            b = 2;
                                            break;
                                        }
                                        c24093OooOOo03 = new C24093OooOOo0(parcelObtain.readInt());
                                        c24091OooOOOo = r28;
                                        string = r30;
                                        c24113OooO00o = r33;
                                        c24120OooOO0o = r34;
                                        i2 = i;
                                        spanned2 = spanned;
                                        b2 = 2;
                                        r28 = c24091OooOOOo;
                                        r30 = string;
                                        r33 = c24113OooO00o;
                                        r34 = c24120OooOO0o;
                                        r38 = r38;
                                        c21362o00oO0o = c21362o00oO0o;
                                        b3 = 1;
                                    } else {
                                        if (parcelObtain.dataAvail() < 5) {
                                            b = b2;
                                            break;
                                        }
                                        byte b8 = parcelObtain.readByte();
                                        long j5 = b8 == b3 ? 4294967296L : b8 == b2 ? 8589934592L : 0L;
                                        jOooO0o0 = C24241OooOOOo.OooO00o(j5, 0L) ? C24240OooOOOO.f81497OooO0O0 : C22189OoooO0.OooO0o0(parcelObtain.readFloat(), j5);
                                        c24091OooOOOo = r28;
                                        string = r30;
                                        c24113OooO00o = r33;
                                        c24120OooOO0o = r34;
                                        i2 = i;
                                        spanned2 = spanned;
                                        b2 = 2;
                                        r28 = c24091OooOOOo;
                                        r30 = string;
                                        r33 = c24113OooO00o;
                                        r34 = c24120OooOO0o;
                                        r38 = r38;
                                        c21362o00oO0o = c21362o00oO0o;
                                        b3 = 1;
                                    }
                                } else {
                                    if (parcelObtain.dataAvail() < 8) {
                                        break;
                                    }
                                    j = parcelObtain.readLong();
                                    int i11 = C21348Ooooo0o.f61767OooO0oo;
                                }
                            }
                            b = b2;
                            i = i2;
                            spanned = spanned2;
                            arrayList.add(new C34680OooO0O0.C20372OooO0O0(new C34691OooOOO0(j, jOooO0o0, c24093OooOOo03, oooOOOO, r28, null, r30, jOooO0o02, r33, r34, null, j2, r38, c21362o00oO0o), spanStart, spanEnd));
                        } else {
                            b = b2;
                            c24093OooOOo0 = c24093OooOOo02;
                            i = i2;
                            spanned = spanned2;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        c24093OooOOo02 = c24093OooOOo0;
                        i2 = i;
                        spanned2 = spanned;
                        b2 = b;
                        b3 = 1;
                    }
                }
                return new C34680OooO0O0(4, text.toString(), arrayList);
            }
        }
        return null;
    }

    @Override // o0ooOO0.InterfaceC31551OooooOo
    public final boolean hasText() {
        ClipDescription primaryClipDescription = this.f112692OooO00o.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
