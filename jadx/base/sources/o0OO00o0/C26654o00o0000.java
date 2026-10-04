package o0OO00o0;

import com.orion.notein.data.p602db.entity.StrokeEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00o0000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$createStrokes$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {37, 39}, m80625m = "invokeSuspend")
public final class C26654o00o0000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91988OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91989OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91990OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f91991OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26654o00o0000(boolean z, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91991OooOoO0 = z;
        this.f91990OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26654o00o0000 c26654o00o0000 = new C26654o00o0000(this.f91991OooOoO0, this.f91990OooOoO, continuation);
        c26654o00o0000.f91988OooOo = obj;
        return c26654o00o0000;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26654o00o0000) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r7.OooOO0(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r7.OooO(r1, r6) == r0) goto L17;
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
        int i = this.f91989OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34993o0ooOoOO abstractC34993o0ooOoOO = (AbstractC34993o0ooOoOO) this.f91988OooOo;
            ArrayList arrayList = this.f91990OooOoO;
            if (this.f91991OooOoO0) {
                StrokeEntity[] strokeEntityArr = (StrokeEntity[]) arrayList.toArray(new StrokeEntity[0]);
                StrokeEntity[] strokeEntityArr2 = (StrokeEntity[]) Arrays.copyOf(strokeEntityArr, strokeEntityArr.length);
                this.f91989OooOo0o = 1;
            } else {
                StrokeEntity[] strokeEntityArr3 = (StrokeEntity[]) arrayList.toArray(new StrokeEntity[0]);
                StrokeEntity[] strokeEntityArr4 = (StrokeEntity[]) Arrays.copyOf(strokeEntityArr3, strokeEntityArr3.length);
                this.f91989OooOo0o = 2;
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
