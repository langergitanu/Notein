package o0OoOOO0;

import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o00Ooo.C29920OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOOO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$setTextBoxColorList$1", m80623f = "TextBoxViewModel.kt", m80624l = {632}, m80625m = "invokeSuspend")
public final class C29066OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f103005OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103006OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f103007OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f103008OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C29920OooO0oo f103009OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29066OooOo0O(C29051OooOO0o c29051OooOO0o, C29920OooO0oo c29920OooO0oo, Continuation<? super C29066OooOo0O> continuation) {
        super(2, continuation);
        this.f103007OooOoO = c29051OooOO0o;
        this.f103009OooOoOO = c29920OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29066OooOo0O(this.f103007OooOoO, this.f103009OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29066OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        List<Integer> list;
        int i;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f103008OooOoO0;
        C29051OooOO0o c29051OooOO0o = this.f103007OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it = ((List) c29051OooOO0o.f102903OooOOO.f121747OooOo0o.getValue()).iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((PenColorVO) it.next()).getSelected()) {
                    break;
                }
                i3++;
            }
            Integer num = new Integer(i3);
            if (num.intValue() < 0) {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            list = this.f103009OooOoOO.f106160OooO0OO;
            if (list.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f103005OooOo = list;
            this.f103006OooOo0o = iIntValue;
            this.f103008OooOoO0 = 1;
            if (c29051OooOO0o.f102895OooO0Oo.OooO0oo(list, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            i = iIntValue;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f103006OooOo0o;
            list = this.f103005OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        c29051OooOO0o.OooO(list.size() > i ? list.get(i).intValue() : list.get(0).intValue());
        return C32460OooOooO.f116667OooO00o;
    }
}
