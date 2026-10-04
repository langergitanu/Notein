package o0o0OO0O;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import androidx.fragment.app.C21893OooOOOo;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import com.orion.notein.p607ui.pageeditor.TiledPageListFragment;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000OOo.C24217OooO0O0;
import o000o0O0.C24569OooO0oo;
import o000o0O0.C24587OooOoo;
import o00o00Oo.C25261OooO0o0;
import o0Oo00o.C28026OooO0OO;
import o0o0OO.C30367OooO0o0;
import o0o0OO.C30374OooOOoo;
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
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.TiledPageListFragment$jumpToNotePage$1", m80623f = "TiledPageListFragment.kt", m80624l = {158}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TiledPageListFragment f108734OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108735OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108736OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f108737OooOoO0;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Bundle> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Fragment f108738OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Fragment fragment) {
            super(0);
            this.f108738OooOo0o = fragment;
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            Fragment fragment = this.f108738OooOo0o;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", fragment, " has null arguments"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(TiledPageListFragment tiledPageListFragment, int i, String str, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f108734OooOo = tiledPageListFragment;
        this.f108737OooOoO0 = i;
        this.f108736OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo000(this.f108734OooOo, this.f108737OooOoO0, this.f108736OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108735OooOo0o;
        TiledPageListFragment tiledPageListFragment = this.f108734OooOo;
        NavEditorLayoutInfo navEditorLayoutInfoCopy$default = null;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            tiledPageListFragment.OooOoO().OooOO0();
            C30367OooO0o0 c30367OooO0o0OooOoO = tiledPageListFragment.OooOoO();
            this.f108735OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30374OooOOoo(c30367OooO0o0OooOoO, this.f108737OooOoO0, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C24587OooOoo c24587OooOoo = new C24587OooOoo(false, false, R.id.noteEditorContainerFragment, true, false, -1, -1, -1, -1);
        Fragment fragmentRequireParentFragment = tiledPageListFragment.requireParentFragment();
        kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
        InterfaceC34595OooO0Oo<? extends o000o0O0.OooO0o> interfaceC34595OooO0OoOooO0O0 = C24035Oooo00o.f80943OooO00o.OooO0O0(OooOo00.class);
        Bundle bundle = (Bundle) new OooO00o(fragmentRequireParentFragment).invoke();
        OooOo.OooO00o<InterfaceC34595OooO0Oo<? extends o000o0O0.OooO0o>, Method> oooO00o = C24569OooO0oo.f83188OooO0O0;
        Method method = oooO00o.get(interfaceC34595OooO0OoOooO0O0);
        if (method == null) {
            method = C24217OooO0O0.OooO0Oo(interfaceC34595OooO0OoOooO0O0).getMethod("fromBundle", (Class[]) Arrays.copyOf(C24569OooO0oo.f83187OooO00o, 1));
            oooO00o.put(interfaceC34595OooO0OoOooO0O0, method);
            kotlin.jvm.internal.OooOOO0.OooO0o(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = method.invoke(null, bundle);
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        NavEditorLayoutInfo navEditorLayoutInfo = ((OooOo00) ((o000o0O0.OooO0o) objInvoke)).f108716OooO0OO;
        if (navEditorLayoutInfo != null) {
            List<String> noteIdList = navEditorLayoutInfo.getNoteIdList();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(noteIdList, 10));
            int i2 = 0;
            for (Object obj3 : noteIdList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                String str = (String) obj3;
                if (i2 == navEditorLayoutInfo.getFocusIndex()) {
                    str = (String) tiledPageListFragment.OooOoO().f108338OooOOOO.getValue();
                }
                arrayList.add(str);
                i2 = i3;
            }
            navEditorLayoutInfoCopy$default = NavEditorLayoutInfo.copy$default(navEditorLayoutInfo, arrayList, 0, null, 0, 14, null);
        }
        C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(tiledPageListFragment), C25261OooO0o0.OooO00o(this.f108736OooOoO, navEditorLayoutInfoCopy$default), c24587OooOoo);
        return C32460OooOooO.f116667OooO00o;
    }
}
