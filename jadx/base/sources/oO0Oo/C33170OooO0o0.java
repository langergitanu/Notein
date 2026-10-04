package oO0Oo;

import android.graphics.Bitmap;
import android.net.Uri;
import com.aspose.words.StyleIdentifier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.C27545o00o0oo0;
import o0OoO0oo.C28692OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32519OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33632Oooo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithPdfPages$2", m80623f = "AiOcrRecognizer.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2, 300}, m80625m = "invokeSuspend")
public final class C33170OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Uri f119979OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f119980OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C33632Oooo f119981OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f119982OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f119983OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f119984OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f119985OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f119986OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f119987OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ String f119988Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f119989Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f119990Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public /* synthetic */ Object f119991Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ C33173OooOO0o f119992Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ C32443OooOOO<Integer, Integer> f119993Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f119994Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ String f119995Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f119996Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f119997Oooo0oo;

    /* JADX INFO: renamed from: oO0Oo.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithPdfPages$2$1", m80623f = "AiOcrRecognizer.kt", m80624l = {270}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33173OooOO0o f119998OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f119999OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f120000OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f120001OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f120002OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f120003OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33173OooOO0o c33173OooOO0o, Uri uri, int i, int i2, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f119998OooOo = c33173OooOO0o;
            this.f120001OooOoO0 = uri;
            this.f120000OooOoO = i;
            this.f120002OooOoOO = i2;
            this.f120003OooOoo0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f119998OooOo, this.f120001OooOoO0, this.f120000OooOoO, this.f120002OooOoOO, this.f120003OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f119999OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33173OooOO0o c33173OooOO0o = this.f119998OooOo;
            C27545o00o0oo0 c27545o00o0oo0 = c33173OooOO0o.f120040OooO00o;
            Uri uri = this.f120001OooOoO0;
            int iOooO0OO = C33173OooOO0o.OooO0OO(c33173OooOO0o);
            int i2 = this.f120000OooOoO;
            int iMin = Math.min(iOooO0OO + i2, this.f120002OooOoOO);
            this.f119999OooOo0o = 1;
            Object objOooO0oo = c27545o00o0oo0.OooO0oo(uri, i2, iMin, this.f120003OooOoo0);
            return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
        }
    }

    /* JADX INFO: renamed from: oO0Oo.OooO0o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithPdfPages$2$2", m80623f = "AiOcrRecognizer.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33173OooOO0o f120004OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f120005OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f120006OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f120007OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f120008OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33173OooOO0o c33173OooOO0o, Uri uri, int i, int i2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f120004OooOo = c33173OooOO0o;
            this.f120007OooOoO0 = uri;
            this.f120006OooOoO = i;
            this.f120008OooOoOO = i2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f120004OooOo, this.f120007OooOoO0, this.f120006OooOoO, this.f120008OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Bitmap>> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f120005OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C27545o00o0oo0 c27545o00o0oo0 = this.f120004OooOo.f120040OooO00o;
            Uri uri = this.f120007OooOoO0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
            this.f120005OooOo0o = 1;
            Object objOooO0oo = c27545o00o0oo0.OooO0oo(uri, this.f120006OooOoO, this.f120008OooOoOO, null);
            return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33170OooO0o0(String str, C33173OooOO0o c33173OooOO0o, C32443OooOOO<Integer, Integer> c32443OooOOO, String str2, String str3, String str4, String str5, Continuation<? super C33170OooO0o0> continuation) {
        super(2, continuation);
        this.f119988Oooo0 = str;
        this.f119992Oooo0O0 = c33173OooOO0o;
        this.f119993Oooo0OO = c32443OooOOO;
        this.f119995Oooo0o0 = str2;
        this.f119994Oooo0o = str3;
        this.f119996Oooo0oO = str4;
        this.f119997Oooo0oo = str5;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33170OooO0o0 c33170OooO0o0 = new C33170OooO0o0(this.f119988Oooo0, this.f119992Oooo0O0, this.f119993Oooo0OO, this.f119995Oooo0o0, this.f119994Oooo0o, this.f119996Oooo0oO, this.f119997Oooo0oo, continuation);
        c33170OooO0o0.f119991Oooo00o = obj;
        return c33170OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C33170OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145 A[LOOP:0: B:37:0x0143->B:38:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d7  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c2 -> B:50:0x01cc). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C33632Oooo c33632OoooOooO00o;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        String str2;
        int i5;
        Uri uri;
        C33173OooOO0o c33173OooOO0o;
        String str3;
        ?? arrayList;
        int i6;
        int i7;
        Uri uri2;
        char c;
        Object obj2;
        C33632Oooo c33632OoooOooO00o2;
        int i8;
        int i9;
        Object objAwait;
        String str4;
        int i10;
        C33170OooO0o0 c33170OooO0o0 = this;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i11 = c33170OooO0o0.f119990Oooo00O;
        C32443OooOOO<Integer, Integer> c32443OooOOO = c33170OooO0o0.f119993Oooo0OO;
        String str5 = "0";
        C33173OooOO0o c33173OooOO0o2 = c33170OooO0o0.f119992Oooo0O0;
        if (i11 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) c33170OooO0o0.f119991Oooo00o;
            String strOooO00o = C24761OooO.OooO00o("toString(...)");
            Uri uri3 = Uri.parse(c33170OooO0o0.f119988Oooo0);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c33173OooOO0o2.f120046OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(uri3);
            String strOooO0OO = C28692OooO0oo.OooO0OO(abstractApplicationC26277OooOoOO, uri3);
            int iIntValue = c32443OooOOO.f116638OooOo0o.intValue();
            int iIntValue2 = c32443OooOOO.f116637OooOo.intValue();
            if (iIntValue >= iIntValue2) {
                return "599999";
            }
            c33632OoooOooO00o = C33609OooO0oo.OooO00o(interfaceC33636Oooo00o2, null, new OooO00o(c33170OooO0o0.f119992Oooo0O0, uri3, iIntValue, iIntValue2, c33170OooO0o0.f119997Oooo0oo, null), 3);
            C32519OooO0oO c32519OooO0oOOooO0oo = oO0O00oo.OooOO0.OooO0oo(oO0O00oo.OooOO0.OooO(iIntValue, iIntValue2), C33173OooOO0o.OooO0OO(c33173OooOO0o2));
            int i12 = c32519OooO0oOOooO0oo.f116812OooOo0o;
            int i13 = c32519OooO0oOOooO0oo.f116811OooOo;
            int i14 = c32519OooO0oOOooO0oo.f116813OooOoO0;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                return "0";
            }
            str = strOooO00o;
            i = i14;
            i2 = i13;
            i3 = iIntValue;
            i4 = iIntValue2;
            interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
            str2 = strOooO0OO;
            i5 = i12;
            uri = uri3;
            c33173OooOO0o = c33173OooOO0o2;
            str3 = str5;
            i8 = 0;
            if (!c33173OooOO0o2.f120039OooO.compareAndSet(true, false)) {
            }
        } else if (i11 == 1) {
            i10 = c33170OooO0o0.f119989Oooo000;
            i = c33170OooO0o0.f119987OooOooo;
            i2 = c33170OooO0o0.f119986OooOooO;
            i5 = c33170OooO0o0.f119984OooOoo;
            i4 = c33170OooO0o0.f119985OooOoo0;
            i3 = c33170OooO0o0.f119983OooOoOO;
            String str6 = c33170OooO0o0.f119982OooOoO0;
            uri = c33170OooO0o0.f119979OooOo;
            str = c33170OooO0o0.f119980OooOo0o;
            interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) c33170OooO0o0.f119991Oooo00o;
            C32446OooOOOo.OooO0O0(obj);
            c33173OooOO0o = c33173OooOO0o2;
            str4 = str6;
            str3 = "0";
            i8 = 0;
            objAwait = obj;
            arrayList = (List) objAwait;
            if (arrayList != 0) {
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = c33170OooO0o0.f119987OooOooo;
            int i16 = c33170OooO0o0.f119986OooOooO;
            int i17 = c33170OooO0o0.f119984OooOoo;
            int i18 = c33170OooO0o0.f119985OooOoo0;
            int i19 = c33170OooO0o0.f119983OooOoOO;
            C33632Oooo c33632Oooo = c33170OooO0o0.f119981OooOoO;
            String str7 = c33170OooO0o0.f119982OooOoO0;
            Uri uri4 = c33170OooO0o0.f119979OooOo;
            String str8 = c33170OooO0o0.f119980OooOo0o;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) c33170OooO0o0.f119991Oooo00o;
            C32446OooOOOo.OooO0O0(obj);
            c33173OooOO0o = c33173OooOO0o2;
            C33632Oooo c33632Oooo2 = c33632Oooo;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o4 = interfaceC33636Oooo00o3;
            Uri uri5 = uri4;
            str3 = "0";
            int i20 = i16;
            i3 = i19;
            i = i15;
            i4 = i18;
            Object objOooO0O0 = obj;
            String str9 = (String) objOooO0O0;
            String str10 = str3;
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str9, str10)) {
                if (i17 == i20) {
                    return str10;
                }
                int i21 = i17 + i;
                c33170OooO0o0 = this;
                str5 = str10;
                i2 = i20;
                uri = uri5;
                c33632OoooOooO00o = c33632Oooo2;
                i5 = i21;
                str2 = str7;
                str = str8;
                interfaceC33636Oooo00o = interfaceC33636Oooo00o4;
                c33173OooOO0o2 = c33173OooOO0o;
                c33173OooOO0o = c33173OooOO0o2;
                str3 = str5;
                i8 = 0;
                if (!c33173OooOO0o2.f120039OooO.compareAndSet(true, false)) {
                    return "599998";
                }
                int iMin = Math.min(C33173OooOO0o.OooO0OO(c33173OooOO0o) + i5, i4) - i5;
                if (c33632OoooOooO00o == null) {
                    arrayList = new ArrayList(iMin);
                    while (i9 < iMin) {
                    }
                    i6 = i5;
                    i7 = i4;
                    ?? r5 = arrayList;
                    Uri uri6 = uri;
                    String str11 = str;
                    int i22 = i;
                    i20 = i2;
                    int i23 = i3;
                    if (C33173OooOO0o.OooO0OO(c33173OooOO0o) + i6 < i7) {
                    }
                    if (i6 == i23) {
                    }
                    c33170OooO0o0.f119991Oooo00o = interfaceC33636Oooo00o;
                    c33170OooO0o0.f119980OooOo0o = str11;
                    c33170OooO0o0.f119979OooOo = uri2;
                    c33170OooO0o0.f119982OooOoO0 = str2;
                    c33170OooO0o0.f119981OooOoO = c33632OoooOooO00o2;
                    c33170OooO0o0.f119983OooOoOO = i23;
                    c33170OooO0o0.f119985OooOoo0 = i7;
                    c33170OooO0o0.f119984OooOoo = i6;
                    c33170OooO0o0.f119986OooOooO = i20;
                    c33170OooO0o0.f119987OooOooo = i22;
                    c33170OooO0o0.f119990Oooo00O = 2;
                    String str12 = str2;
                    uri5 = uri2;
                    c33632Oooo2 = c33632OoooOooO00o2;
                    objOooO0O0 = C33173OooOO0o.OooO0O0(c33170OooO0o0.f119992Oooo0O0, c33170OooO0o0.f119995Oooo0o0, c33170OooO0o0.f119994Oooo0o, c33170OooO0o0.f119988Oooo0, c32443OooOOO, r5, c33170OooO0o0.f119996Oooo0oO, z, c33170OooO0o0);
                    if (objOooO0O0 != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                c33170OooO0o0.f119991Oooo00o = interfaceC33636Oooo00o;
                c33170OooO0o0.f119980OooOo0o = str;
                c33170OooO0o0.f119979OooOo = uri;
                c33170OooO0o0.f119982OooOoO0 = str2;
                c33170OooO0o0.f119981OooOoO = null;
                c33170OooO0o0.f119983OooOoOO = i3;
                c33170OooO0o0.f119985OooOoo0 = i4;
                c33170OooO0o0.f119984OooOoo = i5;
                c33170OooO0o0.f119986OooOooO = i2;
                c33170OooO0o0.f119987OooOooo = i;
                c33170OooO0o0.f119989Oooo000 = iMin;
                c33170OooO0o0.f119990Oooo00O = 1;
                objAwait = c33632OoooOooO00o.await(c33170OooO0o0);
                if (objAwait != enumC32485OooO00o) {
                    str4 = str2;
                    i10 = iMin;
                    arrayList = (List) objAwait;
                    if (arrayList != 0) {
                        String str13 = str4;
                        iMin = i10;
                        str2 = str13;
                        arrayList = new ArrayList(iMin);
                        for (i9 = i8; i9 < iMin; i9++) {
                            arrayList.add(null);
                        }
                        i6 = i5;
                        i7 = i4;
                        ?? r52 = arrayList;
                        Uri uri62 = uri;
                        String str112 = str;
                        int i222 = i;
                        i20 = i2;
                        int i232 = i3;
                        if (C33173OooOO0o.OooO0OO(c33173OooOO0o) + i6 < i7) {
                            int iOooO0OO = C33173OooOO0o.OooO0OO(c33173OooOO0o) + i6;
                            uri2 = uri62;
                            c = 3;
                            obj2 = null;
                            c33632OoooOooO00o2 = C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, null, new OooO0O0(c33170OooO0o0.f119992Oooo0O0, uri62, iOooO0OO, Math.min(C33173OooOO0o.OooO0OO(c33173OooOO0o) + iOooO0OO, i7), null), 3);
                        } else {
                            uri2 = uri62;
                            c = 3;
                            obj2 = null;
                            c33632OoooOooO00o2 = null;
                        }
                        boolean z = i6 == i232;
                        c33170OooO0o0.f119991Oooo00o = interfaceC33636Oooo00o;
                        c33170OooO0o0.f119980OooOo0o = str112;
                        c33170OooO0o0.f119979OooOo = uri2;
                        c33170OooO0o0.f119982OooOoO0 = str2;
                        c33170OooO0o0.f119981OooOoO = c33632OoooOooO00o2;
                        c33170OooO0o0.f119983OooOoOO = i232;
                        c33170OooO0o0.f119985OooOoo0 = i7;
                        c33170OooO0o0.f119984OooOoo = i6;
                        c33170OooO0o0.f119986OooOooO = i20;
                        c33170OooO0o0.f119987OooOooo = i222;
                        c33170OooO0o0.f119990Oooo00O = 2;
                        String str122 = str2;
                        uri5 = uri2;
                        c33632Oooo2 = c33632OoooOooO00o2;
                        objOooO0O0 = C33173OooOO0o.OooO0O0(c33170OooO0o0.f119992Oooo0O0, c33170OooO0o0.f119995Oooo0o0, c33170OooO0o0.f119994Oooo0o, c33170OooO0o0.f119988Oooo0, c32443OooOOO, r52, c33170OooO0o0.f119996Oooo0oO, z, c33170OooO0o0);
                        if (objOooO0O0 != enumC32485OooO00o) {
                            i17 = i6;
                            i4 = i7;
                            i3 = i232;
                            interfaceC33636Oooo00o4 = interfaceC33636Oooo00o;
                            i = i222;
                            str7 = str122;
                            str8 = str112;
                            String str92 = (String) objOooO0O0;
                            String str102 = str3;
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str92, str102)) {
                                return str92;
                            }
                        }
                    } else {
                        str2 = str4;
                        i6 = i5;
                        i7 = i4;
                        ?? r522 = arrayList;
                        Uri uri622 = uri;
                        String str1122 = str;
                        int i2222 = i;
                        i20 = i2;
                        int i2322 = i3;
                        if (C33173OooOO0o.OooO0OO(c33173OooOO0o) + i6 < i7) {
                        }
                        if (i6 == i2322) {
                        }
                        c33170OooO0o0.f119991Oooo00o = interfaceC33636Oooo00o;
                        c33170OooO0o0.f119980OooOo0o = str1122;
                        c33170OooO0o0.f119979OooOo = uri2;
                        c33170OooO0o0.f119982OooOoO0 = str2;
                        c33170OooO0o0.f119981OooOoO = c33632OoooOooO00o2;
                        c33170OooO0o0.f119983OooOoOO = i2322;
                        c33170OooO0o0.f119985OooOoo0 = i7;
                        c33170OooO0o0.f119984OooOoo = i6;
                        c33170OooO0o0.f119986OooOooO = i20;
                        c33170OooO0o0.f119987OooOooo = i2222;
                        c33170OooO0o0.f119990Oooo00O = 2;
                        String str1222 = str2;
                        uri5 = uri2;
                        c33632Oooo2 = c33632OoooOooO00o2;
                        objOooO0O0 = C33173OooOO0o.OooO0O0(c33170OooO0o0.f119992Oooo0O0, c33170OooO0o0.f119995Oooo0o0, c33170OooO0o0.f119994Oooo0o, c33170OooO0o0.f119988Oooo0, c32443OooOOO, r522, c33170OooO0o0.f119996Oooo0oO, z, c33170OooO0o0);
                        if (objOooO0O0 != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }
    }
}
