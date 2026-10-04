package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.sticker.CopyUriToStickerFileResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00o00o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$copyUris2StickerFile$2", m80623f = "StickerUseCase.kt", m80624l = {649, 658}, m80625m = "invokeSuspend")
public final class C27521o00o00o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends CopyUriToStickerFileResult>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f96453OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27538o00o0o0O f96454OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f96455OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f96456OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Uri f96457OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public File f96458OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f96459OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f96460OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f96461OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f96462Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96463Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ File f96464Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27521o00o00o0(List<? extends Uri> list, C27538o00o0o0O c27538o00o0o0O, File file, Continuation<? super C27521o00o00o0> continuation) {
        super(2, continuation);
        this.f96462Oooo000 = list;
        this.f96463Oooo00O = c27538o00o0o0O;
        this.f96464Oooo00o = file;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27521o00o00o0(this.f96462Oooo000, this.f96463Oooo00O, this.f96464Oooo00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends CopyUriToStickerFileResult>> continuation) {
        return ((C27521o00o00o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0100 -> B:27:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:28:0x0108). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Collection arrayList;
        Iterator it;
        C27538o00o0o0O c27538o00o0o0O;
        File file;
        C27538o00o0o0O c27538o00o0o0O2;
        File file2;
        Collection collection;
        Iterator it2;
        Uri uri;
        String str;
        String str2;
        File file3;
        boolean zOooO0O0;
        CopyUriToStickerFileResult copyUriToStickerFileResult;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96461OooOooo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<Uri> list = this.f96462Oooo000;
            arrayList = new ArrayList();
            it = list.iterator();
            c27538o00o0o0O = this.f96463Oooo00O;
            file = this.f96464Oooo00o;
            if (!it.hasNext()) {
            }
        } else if (i == 1) {
            String str3 = this.f96459OooOoo0;
            Uri uri2 = this.f96457OooOoOO;
            Iterator it3 = this.f96455OooOoO;
            Collection collection2 = this.f96456OooOoO0;
            File file4 = this.f96453OooOo;
            C27538o00o0o0O c27538o00o0o0O3 = this.f96454OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            file2 = file4;
            c27538o00o0o0O2 = c27538o00o0o0O3;
            it2 = it3;
            collection = collection2;
            str = str3;
            uri = uri2;
            if (!((Boolean) obj).booleanValue()) {
            }
            C34406OooO00o.f123390OooO00o.OooO00o("copyUris2StickerFile, srcUri: " + uri + ", extension: " + str2, new Object[0]);
            file3 = new File(file2, Oooo0oO.o0Oo0oo.OooO0Oo(str, ".", str2));
            zOooO0O0 = C31190OooO0oo.OooO0O0(c27538o00o0o0O2.f96554OooO0o, uri, file3);
            if (str2.equals("svg")) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z = this.f96460OooOooO;
            file3 = this.f96458OooOoo;
            str = this.f96459OooOoo0;
            uri = this.f96457OooOoOO;
            it2 = this.f96455OooOoO;
            collection = this.f96456OooOoO0;
            file2 = this.f96453OooOo;
            c27538o00o0o0O2 = this.f96454OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            float fFloatValue = ((Number) obj).floatValue();
            zOooO0O0 = z;
            arrayList = collection;
            if (zOooO0O0) {
                String absolutePath = file3.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                copyUriToStickerFileResult = new CopyUriToStickerFileResult(str, uri, absolutePath, fFloatValue);
            } else {
                copyUriToStickerFileResult = null;
            }
            if (copyUriToStickerFileResult != null) {
                arrayList.add(copyUriToStickerFileResult);
            }
            it = it2;
            file = file2;
            c27538o00o0o0O = c27538o00o0o0O2;
            if (!it.hasNext()) {
                uri = (Uri) it.next();
                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                this.f96454OooOo0o = c27538o00o0o0O;
                this.f96453OooOo = file;
                this.f96456OooOoO0 = arrayList;
                this.f96455OooOoO = it;
                this.f96457OooOoOO = uri;
                this.f96459OooOoo0 = strOooO00o;
                this.f96458OooOoo = null;
                this.f96461OooOooo = 1;
                c27538o00o0o0O.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27532o00o0Oo(c27538o00o0o0O, uri, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    c27538o00o0o0O2 = c27538o00o0o0O;
                    file2 = file;
                    str = strOooO00o;
                    it2 = it;
                    obj = objOooO0o;
                    collection = arrayList;
                    str2 = !((Boolean) obj).booleanValue() ? "svg" : "png";
                    C34406OooO00o.f123390OooO00o.OooO00o("copyUris2StickerFile, srcUri: " + uri + ", extension: " + str2, new Object[0]);
                    file3 = new File(file2, Oooo0oO.o0Oo0oo.OooO0Oo(str, ".", str2));
                    zOooO0O0 = C31190OooO0oo.OooO0O0(c27538o00o0o0O2.f96554OooO0o, uri, file3);
                    if (str2.equals("svg")) {
                        fFloatValue = 1.0f;
                        arrayList = collection;
                        if (zOooO0O0) {
                        }
                        if (copyUriToStickerFileResult != null) {
                        }
                        it = it2;
                        file = file2;
                        c27538o00o0o0O = c27538o00o0o0O2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        this.f96454OooOo0o = c27538o00o0o0O2;
                        this.f96453OooOo = file2;
                        this.f96456OooOoO0 = collection;
                        this.f96455OooOoO = it2;
                        this.f96457OooOoOO = uri;
                        this.f96459OooOoo0 = str;
                        this.f96458OooOoo = file3;
                        this.f96460OooOooO = zOooO0O0;
                        this.f96461OooOooo = 2;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27530o00o0OOO(c27538o00o0o0O2, uri, null), this);
                        if (obj != enumC32485OooO00o) {
                            z = zOooO0O0;
                            float fFloatValue2 = ((Number) obj).floatValue();
                            zOooO0O0 = z;
                            arrayList = collection;
                            if (zOooO0O0) {
                            }
                            if (copyUriToStickerFileResult != null) {
                            }
                            it = it2;
                            file = file2;
                            c27538o00o0o0O = c27538o00o0o0O2;
                            if (!it.hasNext()) {
                                return (List) arrayList;
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }
    }
}
