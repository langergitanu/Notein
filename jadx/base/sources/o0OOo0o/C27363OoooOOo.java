package o0OOo0o;

import android.graphics.Color;
import com.orion.notein.domain.models.note.ColorSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ColorSetUseCase$favoriteColorSet$2", m80623f = "ColorSetUseCase.kt", m80624l = {46, 59}, m80625m = "invokeSuspend")
public final class C27363OoooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27366OoooOoo f95272OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95273OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f95274OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f95275OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f95276OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27363OoooOOo(C27366OoooOoo c27366OoooOoo, int i, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f95272OooOo = c27366OoooOoo;
        this.f95275OooOoO0 = i;
        this.f95274OooOoO = str;
        this.f95276OooOoOO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27363OoooOOo(this.f95272OooOo, this.f95275OooOoO0, this.f95274OooOoO, this.f95276OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C27363OoooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r2.OooO00o(r7, r19) == r1) goto L24;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0OO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95273OooOo0o;
        C27366OoooOoo c27366OoooOoo = this.f95272OooOo;
        int i2 = 2;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OO0o0O.OooO oooO = c27366OoooOoo.f95285OooO00o;
            this.f95273OooOo0o = 1;
            objOooO0OO = oooO.OooO0OO(this.f95275OooOoO0, this);
            if (objOooO0OO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            i2 = 1;
            return new Integer(i2);
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO0OO = obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objOooO0OO) {
            if (((ColorSet) obj2).getType() == 1) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() < 12) {
            ColorSet colorSet = new ColorSet(null, this.f95274OooOoO, this.f95276OooOoOO, Color.parseColor("#EFEFEF"), 0, 1, 0L, this.f95275OooOoO0, 65, null);
            o0OO0o0O.OooO oooO2 = c27366OoooOoo.f95285OooO00o;
            this.f95273OooOo0o = 2;
        }
        return new Integer(i2);
    }
}
