package o0o00ooo;

import androidx.core.view.InputDeviceCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00ooo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteListFragment$onNoteListItemMerged$1", m80623f = "FavoriteListFragment.kt", m80624l = {509, InputDeviceCompat.SOURCE_DPAD}, m80625m = "invokeSuspend")
public final class C30166OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f107351OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24030OooOoo f107352OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f107353OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public FavoriteListFragment f107354OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f107355OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ FavoriteListFragment f107356OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ boolean f107357OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107358OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107359OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30166OooOoO(boolean z, FavoriteListFragment favoriteListFragment, NoteVO noteVO, NoteVO noteVO2, Continuation<? super C30166OooOoO> continuation) {
        super(2, continuation);
        this.f107357OooOoo0 = z;
        this.f107356OooOoo = favoriteListFragment;
        this.f107358OooOooO = noteVO;
        this.f107359OooOooo = noteVO2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30166OooOoO(this.f107357OooOoo0, this.f107356OooOoo, this.f107358OooOooO, this.f107359OooOooo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30166OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r10 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:21:0x0089). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteVO noteVO;
        C24030OooOoo c24030OooOoo;
        C24030OooOoo c24030OooOoo2;
        Iterator it;
        C24030OooOoo c24030OooOoo3;
        FavoriteListFragment favoriteListFragment;
        ActivityC21897OooOo0 activity;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107355OooOoOO;
        FavoriteListFragment favoriteListFragment2 = this.f107356OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24030OooOoo c24030OooOoo4 = new C24030OooOoo();
            boolean z = this.f107357OooOoo0;
            noteVO = this.f107359OooOooo;
            if (z) {
                it = ((Iterable) favoriteListFragment2.OooOoo().f77172OooooOO.f121747OooOo0o.getValue()).iterator();
                c24030OooOoo3 = c24030OooOoo4;
                favoriteListFragment = favoriteListFragment2;
                while (it.hasNext()) {
                }
                if (c24030OooOoo3.f80938OooOo0o) {
                    String string = favoriteListFragment2.getString(R.string.move_fail);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(activity, string);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = favoriteListFragment2.OooOoo();
            NoteVO noteVO2 = this.f107358OooOooO;
            int type = noteVO2.getType();
            String id = noteVO2.getId();
            this.f107352OooOo0o = c24030OooOoo4;
            this.f107351OooOo = c24030OooOoo4;
            this.f107355OooOoOO = 2;
            Object objOooOOoo = oooO0OOOooOoo.OooOOoo(type, id, noteVO, this);
            if (objOooOOoo != enumC32485OooO00o) {
                c24030OooOoo = c24030OooOoo4;
                obj = objOooOOoo;
                c24030OooOoo2 = c24030OooOoo;
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            it = this.f107353OooOoO;
            favoriteListFragment = this.f107354OooOoO0;
            noteVO = (NoteVO) this.f107351OooOo;
            c24030OooOoo3 = this.f107352OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c24030OooOoo3.f80938OooOo0o = (!((Boolean) obj).booleanValue()) | c24030OooOoo3.f80938OooOo0o;
            while (it.hasNext()) {
                NoteVO noteVO3 = (NoteVO) it.next();
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO3.getId(), noteVO.getId())) {
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo2 = favoriteListFragment.OooOoo();
                    int type2 = noteVO3.getType();
                    String id2 = noteVO3.getId();
                    this.f107352OooOo0o = c24030OooOoo3;
                    this.f107351OooOo = noteVO;
                    this.f107354OooOoO0 = favoriteListFragment;
                    this.f107353OooOoO = it;
                    this.f107355OooOoOO = 1;
                    obj = oooO0OOOooOoo2.OooOOoo(type2, id2, noteVO, this);
                }
            }
            if (c24030OooOoo3.f80938OooOo0o && (activity = favoriteListFragment2.getActivity()) != null) {
                String string2 = favoriteListFragment2.getString(R.string.move_fail);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0oO(activity, string2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c24030OooOoo = (C24030OooOoo) this.f107351OooOo;
        c24030OooOoo2 = this.f107352OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c24030OooOoo.f80938OooOo0o = !((Boolean) obj).booleanValue();
        c24030OooOoo3 = c24030OooOoo2;
        if (c24030OooOoo3.f80938OooOo0o) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
