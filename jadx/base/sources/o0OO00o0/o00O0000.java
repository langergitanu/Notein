package o0OO00o0;

import com.orion.notein.data.p602db.entity.ImageEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$createImage$2", m80623f = "ImageLocalDataSource.kt", m80624l = {32, 34}, m80625m = "invokeSuspend")
public final class o00O0000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91647OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91648OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91649OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f91650OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(boolean z, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91650OooOoO0 = z;
        this.f91649OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00O0000 o00o00002 = new o00O0000(this.f91650OooOoO0, this.f91649OooOoO, continuation);
        o00o00002.f91647OooOo = obj;
        return o00o00002;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super C32460OooOooO> continuation) {
        return ((o00O0000) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r7.OooOO0o(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r7.OooOO0O(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91648OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34767o0000oOO abstractC34767o0000oOO = (AbstractC34767o0000oOO) this.f91647OooOo;
            ArrayList arrayList = this.f91649OooOoO;
            if (this.f91650OooOoO0) {
                ImageEntity[] imageEntityArr = (ImageEntity[]) arrayList.toArray(new ImageEntity[0]);
                ImageEntity[] imageEntityArr2 = (ImageEntity[]) Arrays.copyOf(imageEntityArr, imageEntityArr.length);
                this.f91648OooOo0o = 1;
            } else {
                ImageEntity[] imageEntityArr3 = (ImageEntity[]) arrayList.toArray(new ImageEntity[0]);
                ImageEntity[] imageEntityArr4 = (ImageEntity[]) Arrays.copyOf(imageEntityArr3, imageEntityArr3.length);
                this.f91648OooOo0o = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
