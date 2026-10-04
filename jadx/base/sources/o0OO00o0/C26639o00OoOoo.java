package o0OO00o0;

import com.orion.notein.data.p602db.entity.ShapeEntity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34967o00ooo00;

/* JADX INFO: renamed from: o0OO00o0.o00OoOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ShapeLocalDataSource$createShape$2", m80623f = "ShapeLocalDataSource.kt", m80624l = {33, 35}, m80625m = "invokeSuspend")
public final class C26639o00OoOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34967o00ooo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91945OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91946OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91947OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f91948OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26639o00OoOoo(boolean z, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f91948OooOoO0 = z;
        this.f91947OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26639o00OoOoo c26639o00OoOoo = new C26639o00OoOoo(this.f91948OooOoO0, this.f91947OooOoO, continuation);
        c26639o00OoOoo.f91945OooOo = obj;
        return c26639o00OoOoo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34967o00ooo00 abstractC34967o00ooo00, Continuation<? super C32460OooOooO> continuation) {
        return ((C26639o00OoOoo) create(abstractC34967o00ooo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r7.OooO0oo(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r7.OooO0oO(r1, r6) == r0) goto L17;
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
        int i = this.f91946OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34967o00ooo00 abstractC34967o00ooo00 = (AbstractC34967o00ooo00) this.f91945OooOo;
            ArrayList arrayList = this.f91947OooOoO;
            if (this.f91948OooOoO0) {
                ShapeEntity[] shapeEntityArr = (ShapeEntity[]) arrayList.toArray(new ShapeEntity[0]);
                ShapeEntity[] shapeEntityArr2 = (ShapeEntity[]) Arrays.copyOf(shapeEntityArr, shapeEntityArr.length);
                this.f91946OooOo0o = 1;
            } else {
                ShapeEntity[] shapeEntityArr3 = (ShapeEntity[]) arrayList.toArray(new ShapeEntity[0]);
                ShapeEntity[] shapeEntityArr4 = (ShapeEntity[]) Arrays.copyOf(shapeEntityArr3, shapeEntityArr3.length);
                this.f91946OooOo0o = 2;
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
