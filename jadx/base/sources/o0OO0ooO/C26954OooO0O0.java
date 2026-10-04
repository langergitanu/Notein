package o0OO0ooO;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import java.io.File;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oo0oO0.InterfaceC34791o000o00O;
import oo0oO0.InterfaceC34847o00Oo0;

/* JADX INFO: renamed from: o0OO0ooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.material.MaterialDownloadRepositoryImpl$deleteMaterial$2", m80623f = "MaterialDownloadRepositoryImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5, StyleIdentifier.SMART_HYPERLINK, StyleIdentifier.HASHTAG}, m80625m = "invokeSuspend")
public final class C26954OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26952OooO f93621OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93622OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93623OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26954OooO0O0(C26952OooO c26952OooO, String str, Continuation<? super C26954OooO0O0> continuation) {
        super(2, continuation);
        this.f93621OooOo = c26952OooO;
        this.f93623OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26954OooO0O0(this.f93621OooOo, this.f93623OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26954OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r12.OooO0O0(r4, r11) != r2) goto L36;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String localPath;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93622OooOo0o;
        String str = this.f93623OooOoO0;
        C26952OooO c26952OooO = this.f93621OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34791o000o00O interfaceC34791o000o00O = c26952OooO.f93613OooO00o;
            this.f93622OooOo0o = 1;
            obj = interfaceC34791o000o00O.OooO0Oo(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.f123390OooO00o.OooO00o("Material deleted: ".concat(str), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34847o00Oo0 interfaceC34847o00Oo0 = c26952OooO.f93614OooO0O0;
            this.f93622OooOo0o = 3;
        }
        MaterialDownloadStateEntity materialDownloadStateEntity = (MaterialDownloadStateEntity) obj;
        if (materialDownloadStateEntity != null && (localPath = materialDownloadStateEntity.getLocalPath()) != null) {
            if (C33599OooOo0O.Oooo0o0(localPath)) {
                localPath = null;
            }
            if (localPath != null) {
                try {
                    File file = new File(localPath);
                    if (file.exists()) {
                        boolean zOooO0Oo = C32501OooO0oO.OooO0Oo(file);
                        C34406OooO00o.f123390OooO00o.OooO00o("Deleted local file for material " + str + ": " + localPath + ", success=" + zOooO0Oo, new Object[0]);
                    }
                } catch (Exception e) {
                    C34406OooO00o.f123390OooO00o.OooOO0o(e, C22237OooO0o0.OooO00o("Failed to delete local file for material ", str, ": ", localPath), new Object[0]);
                }
            }
        }
        InterfaceC34791o000o00O interfaceC34791o000o00O2 = c26952OooO.f93613OooO00o;
        this.f93622OooOo0o = 2;
        if (interfaceC34791o000o00O2.OooO0O0(str, this) != enumC32485OooO00o) {
            InterfaceC34847o00Oo0 interfaceC34847o00Oo02 = c26952OooO.f93614OooO0O0;
            this.f93622OooOo0o = 3;
        }
        return enumC32485OooO00o;
    }
}
