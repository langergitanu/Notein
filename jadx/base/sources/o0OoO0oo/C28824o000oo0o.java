package o0OoO0oo;

import android.graphics.PointF;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.p607ui.noteeditor.C23353OooOoO0;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0o0000o.C29728OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o000oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$persistRulerStateAsync$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1328, 1338}, m80625m = "invokeSuspend")
public final class C28824o000oo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f102048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102049OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102050OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f102051OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C29728OooO0Oo f102052OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28824o000oo0o(String str, com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, C29728OooO0Oo c29728OooO0Oo, Continuation<? super C28824o000oo0o> continuation) {
        super(2, continuation);
        this.f102051OooOoO0 = str;
        this.f102050OooOoO = oooO0OO;
        this.f102052OooOoOO = c29728OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28824o000oo0o c28824o000oo0o = new C28824o000oo0o(this.f102051OooOoO0, this.f102050OooOoO, this.f102052OooOoOO, continuation);
        c28824o000oo0o.f102048OooOo = obj;
        return c28824o000oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28824o000oo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        if (r0 == r2) goto L33;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        String str;
        Object objOooOOOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102049OooOo0o;
        String str2 = this.f102051OooOoO0;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102050OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (str2.length() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorContainerViewModel");
                c20358OooO00o.OooOO0O("persistRulerStateAsync skipped: empty noteId", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            try {
                objOooO00o = oooO0OO.f73359OooOOO0.OooO0Oo();
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = null;
            }
            str = (String) objOooO00o;
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f102048OooOo = str;
            this.f102049OooOo0o = 1;
            objOooOOOO = oooO0OO.OooOOOO(this);
            if (objOooOOOO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = (String) this.f102048OooOo;
        C32446OooOOOo.OooO0O0(obj);
        objOooOOOO = obj;
        Map<String, C23353OooOoO0> map = (Map) objOooOOOO;
        oooO0OO.getClass();
        String str3 = str + C18115b5.CONNECTOR + str2;
        C29728OooO0Oo c29728OooO0Oo = this.f102052OooOoOO;
        PointF pointF = c29728OooO0Oo.f105432OooO0O0;
        map.put(str3, new C23353OooOoO0(c29728OooO0Oo.f105431OooO00o, pointF.x, pointF.y, c29728OooO0Oo.f105433OooO0OO, c29728OooO0Oo.f105434OooO0Oo, c29728OooO0Oo.f105436OooO0o0, c29728OooO0Oo.f105435OooO0o));
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteEditorContainerViewModel");
        c20358OooO00o2.OooOO0("persistRulerStateAsync -> uid=%s noteId=%s visible=%s center=(%.1f, %.1f)", str, str2, Boolean.valueOf(c29728OooO0Oo.f105431OooO00o), new Float(pointF.x), new Float(pointF.y));
        this.f102048OooOo = null;
        this.f102049OooOo0o = 2;
        oooO0OO.f73401OooooOO = map;
        Object objOooO00o2 = C24332OooO.OooO00o(oooO0OO.f73367OooOo00, new C28820o000oo(map, oooO0OO, null), this);
        if (objOooO00o2 != EnumC32485OooO00o.f116726OooOo0o) {
            objOooO00o2 = C32460OooOooO.f116667OooO00o;
        }
    }
}
