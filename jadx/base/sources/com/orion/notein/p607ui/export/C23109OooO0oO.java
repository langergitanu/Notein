package com.orion.notein.p607ui.export;

import android.net.Uri;
import com.aspose.slides.internal.p332p7.OooOOOO;
import com.orion.notein.p607ui.export.OooO0o;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00OOO0;
import o0Oo0O00.C28051OooO00o;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.export.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportViewModel$export$1", m80623f = "ExportViewModel.kt", m80624l = {164, 168, 171, 180, 187, 190, 194}, m80625m = "invokeSuspend")
public final class C23109OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f71780OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71781OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f71782OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f71783OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f71784OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArrayList f71785OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f71786OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f71787OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f71788OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f71789Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C33163OooO0oO f71790Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ Uri f71791Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23109OooO0oO(OooO0o oooO0o, int i, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3, C33163OooO0oO c33163OooO0oO, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f71784OooOoOO = oooO0o;
        this.f71786OooOoo0 = i;
        this.f71785OooOoo = copyOnWriteArrayList;
        this.f71787OooOooO = str;
        this.f71788OooOooo = str2;
        this.f71789Oooo000 = str3;
        this.f71790Oooo00O = c33163OooO0oO;
        this.f71791Oooo00o = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33163OooO0oO c33163OooO0oO = this.f71790Oooo00O;
        Uri uri = this.f71791Oooo00o;
        return new C23109OooO0oO(this.f71784OooOoOO, this.f71786OooOoo0, this.f71785OooOoo, this.f71787OooOooO, this.f71788OooOooo, this.f71789Oooo000, c33163OooO0oO, uri, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23109OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r1 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        if (r1 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        if (r0.emit(r1, r7) == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        if (r0.emit(r2, r7) != r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0155, code lost:
    
        if (r0.emit(r1, r7) == r9) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        int iIntValue2;
        Object objOooO0o0;
        int i;
        Object objOooO0o;
        File file;
        C23109OooO0oO c23109OooO0oO = this;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23109OooO0oO.f71782OooOoO;
        Uri uri = c23109OooO0oO.f71791Oooo00o;
        OooO0o oooO0o = c23109OooO0oO.f71784OooOoOO;
        int i3 = c23109OooO0oO.f71786OooOoo0;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                iIntValue = ((Number) oooO0o.f71764OooOOo.getValue()).intValue();
                iIntValue2 = ((Number) oooO0o.f71769OooOo00.getValue()).intValue();
                C33772OooooOo c33772OooooOo = oooO0o.f71756OooO0oo;
                Integer num = new Integer(0);
                c23109OooO0oO.f71781OooOo0o = iIntValue;
                c23109OooO0oO.f71780OooOo = iIntValue2;
                c23109OooO0oO.f71782OooOoO = 1;
                if (c33772OooooOo.emit(num, c23109OooO0oO) != enumC32485OooO00o) {
                    int i4 = iIntValue2;
                    String str = c23109OooO0oO.f71787OooOooO;
                    if (i3 != 0) {
                        int i5 = iIntValue;
                        OooO0o.C23107OooO0Oo c23107OooO0Oo = oooO0o.f71765OooOOo0;
                        c23109OooO0oO.f71781OooOo0o = i5;
                        c23109OooO0oO.f71782OooOoO = 2;
                        objOooO0o0 = OooO0o.OooO0o0(oooO0o, c23109OooO0oO.f71785OooOoo, str, i5, i4, c23107OooO0Oo, c23109OooO0oO.f71788OooOooo, c23109OooO0oO);
                        i = i5;
                    } else if (i3 == 1) {
                        OooO0o.C23107OooO0Oo c23107OooO0Oo2 = oooO0o.f71765OooOOo0;
                        c23109OooO0oO.f71781OooOo0o = iIntValue;
                        c23109OooO0oO.f71782OooOoO = 3;
                        i = iIntValue;
                        objOooO0o = OooO0o.OooO0o(oooO0o, c23109OooO0oO.f71789Oooo000, c23109OooO0oO.f71785OooOoo, str, i, i4, c23107OooO0Oo2, c23109OooO0oO.f71788OooOooo, c23109OooO0oO);
                        c23109OooO0oO = c23109OooO0oO;
                    } else {
                        file = null;
                        if (file == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            StringBuilder sbOooO00o = OooOOOO.OooO00o(c20358OooO00o, "TiledPageViewModel", "export: exportedFile is null, exportType=", iIntValue, ", idType=");
                            sbOooO00o.append(i3);
                            c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
                            C33772OooooOo c33772OooooOo2 = oooO0o.f71757OooOO0;
                            OooO0o.OooO00o oooO00o = new OooO0o.OooO00o(null, null);
                            c23109OooO0oO.f71782OooOoO = 4;
                        } else if (!C31190OooO0oo.OooO0OO(c23109OooO0oO.f71790Oooo00O, file, uri)) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("TiledPageViewModel");
                            c20358OooO00o2.OooO0OO("export: Failed to dump exported file to output URI: " + uri, new Object[0]);
                            C33772OooooOo c33772OooooOo3 = oooO0o.f71757OooOO0;
                            OooO0o.OooO00o oooO00o2 = new OooO0o.OooO00o(null, null);
                            c23109OooO0oO.f71782OooOoO = 6;
                        } else {
                            C27449o00O0OoO c27449o00O0OoO = oooO0o.f71752OooO0Oo;
                            c23109OooO0oO.f71783OooOoO0 = file;
                            c23109OooO0oO.f71782OooOoO = 5;
                            Object objOooO00o = C24332OooO.OooO00o(C28051OooO00o.OooO00o(c27449o00O0OoO.f96060OooOoOO), new o00OOO0(2, null), c23109OooO0oO);
                            if (objOooO00o != enumC32485OooO00o) {
                                objOooO00o = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO00o != enumC32485OooO00o) {
                                C33772OooooOo c33772OooooOo4 = oooO0o.f71757OooOO0;
                                OooO0o.OooO00o oooO00o3 = new OooO0o.OooO00o(uri, file);
                                c23109OooO0oO.f71783OooOoO0 = null;
                                c23109OooO0oO.f71782OooOoO = 7;
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                iIntValue2 = c23109OooO0oO.f71780OooOo;
                iIntValue = c23109OooO0oO.f71781OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                int i42 = iIntValue2;
                String str2 = c23109OooO0oO.f71787OooOooO;
                if (i3 != 0) {
                }
                return enumC32485OooO00o;
            case 2:
                int i6 = c23109OooO0oO.f71781OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i6;
                objOooO0o0 = obj;
                file = (File) objOooO0o0;
                iIntValue = i;
                if (file == null) {
                }
                return enumC32485OooO00o;
            case 3:
                int i7 = c23109OooO0oO.f71781OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i7;
                objOooO0o = obj;
                file = (File) objOooO0o;
                iIntValue = i;
                if (file == null) {
                }
                return enumC32485OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 5:
                file = c23109OooO0oO.f71783OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo42 = oooO0o.f71757OooOO0;
                OooO0o.OooO00o oooO00o32 = new OooO0o.OooO00o(uri, file);
                c23109OooO0oO.f71783OooOoO0 = null;
                c23109OooO0oO.f71782OooOoO = 7;
                break;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
