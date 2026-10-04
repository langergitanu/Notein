package o0OOo0o;

import com.orion.notein.domain.models.note.ColorSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ColorSetUseCase$unFavoriteColorSet$2", m80623f = "ColorSetUseCase.kt", m80624l = {67, 72}, m80625m = "invokeSuspend")
public final class C27364OoooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27366OoooOoo f95277OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95278OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f95279OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f95280OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27364OoooOo0(C27366OoooOoo c27366OoooOoo, int i, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f95277OooOo = c27366OoooOoo;
        this.f95280OooOoO0 = i;
        this.f95279OooOoO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27364OoooOo0(this.f95277OooOo, this.f95280OooOoO0, this.f95279OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C27364OoooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r8.OooO0O0(r1, r7) == r0) goto L30;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95278OooOo0o;
        C27366OoooOoo c27366OoooOoo = this.f95277OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OO0o0O.OooO oooO = c27366OoooOoo.f95285OooO00o;
            this.f95278OooOo0o = 1;
            obj = oooO.OooO0OO(this.f95280OooOoO0, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return new Integer(0);
        }
        C32446OooOOOo.OooO0O0(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (((ColorSet) obj2).getType() == 1) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ColorSet) next).getColors(), this.f95279OooOoO)) {
                break;
            }
        }
        ColorSet colorSet = (ColorSet) next;
        if (colorSet != null) {
            o0OO0o0O.OooO oooO2 = c27366OoooOoo.f95285OooO00o;
            String id = colorSet.getId();
            this.f95278OooOo0o = 2;
        }
        return new Integer(0);
    }
}
