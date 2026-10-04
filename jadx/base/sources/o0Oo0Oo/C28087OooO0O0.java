package o0Oo0Oo;

import com.orion.notein.domain.models.backup.BackupFile;
import kotlin.coroutines.Continuation;
import o0OOOooO.EnumC27267OooO00o;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0Oo0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.netdisk.auth.BaiduAuthorizationViewModel$fetchAuthorization$1", m80623f = "BaiduAuthorizationViewModel.kt", m80624l = {31, 32, 34, 39}, m80625m = "invokeSuspend")
public final class C28087OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28086OooO00o f99555OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99556OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99557OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28087OooO0O0(C28086OooO00o c28086OooO00o, String str, Continuation<? super C28087OooO0O0> continuation) {
        super(2, continuation);
        this.f99555OooOo = c28086OooO00o;
        this.f99557OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28087OooO0O0(this.f99555OooOo, this.f99557OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28087OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r7.OooO0oO(r9, r8) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r2.emit(r9, r8) != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC27267OooO00o enumC27267OooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99556OooOo0o;
        C28086OooO00o c28086OooO00o = this.f99555OooOo;
        InterfaceC27293OooO0oo interfaceC27293OooO0oo = c28086OooO00o.f99550OooO0Oo;
        C33772OooooOo c33772OooooOo = c28086OooO00o.f99552OooO0o0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            EnumC27267OooO00o enumC27267OooO00o2 = EnumC27267OooO00o.f95063OooOo;
            this.f99556OooOo0o = 1;
            if (c33772OooooOo.emit(enumC27267OooO00o2, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else if (i == 2) {
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                enumC27267OooO00o = EnumC27267OooO00o.f95065OooOoO;
                this.f99556OooOo0o = 4;
            } else {
                int iOrdinal = BackupFile.DiskVendor.Baidu.ordinal();
                this.f99556OooOo0o = 3;
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            enumC27267OooO00o = EnumC27267OooO00o.f95066OooOoO0;
            this.f99556OooOo0o = 4;
        }
        this.f99556OooOo0o = 2;
        obj = interfaceC27293OooO0oo.OooOO0O(this.f99557OooOoO0, this);
        if (obj != enumC32485OooO00o) {
            if (((Boolean) obj).booleanValue()) {
            }
        }
        return enumC32485OooO00o;
    }
}
