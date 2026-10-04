package o0Ooo0oo;

import com.orion.notein.App;
import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import com.orion.notein.domain.models.note.ToolBoxInfo;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o0OO.C26435OoooO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo0oo.o0000OO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveToolBoxInfo$1", m80623f = "PenBarViewModel.kt", m80624l = {906, 914, 918}, m80625m = "invokeSuspend")
public final class C29517o0000OO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f104695OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f104696OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f104697OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104698OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29517o0000OO0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, int i, Continuation<? super C29517o0000OO0> continuation) {
        super(2, continuation);
        this.f104698OooOoO0 = oooO0O0;
        this.f104697OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29517o0000OO0(this.f104698OooOoO0, this.f104697OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29517o0000OO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r13 != r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        ToolBoxInfo toolBoxInfo;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104695OooOo;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104698OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0OO00o0.o00000O0 o00000o0OooO0Oo = oooO0O0.f75141OooO0Oo.OooO0Oo(App.f69564OoooOo0);
            this.f104695OooOo = 1;
            obj = C25252OooO0Oo.OooOOo(o00000o0OooO0Oo, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str2 = this.f104696OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            toolBoxInfo = (ToolBoxInfo) obj;
            if (toolBoxInfo != null || (toolBoxInfo = ToolBoxInfo.copy$default(toolBoxInfo, null, null, this.f104697OooOoO, 3, null)) == null) {
                ToolBoxInfo toolBoxInfo2 = new ToolBoxInfo(C24761OooO.OooO00o("toString(...)"), str2, this.f104697OooOoO);
            }
            C26435OoooO0O c26435OoooO0O = oooO0O0.f75142OooO0o;
            this.f104696OooOo0o = null;
            this.f104695OooOo = 3;
            c26435OoooO0O.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(c26435OoooO0O.f90799OooO0O0.toEntity(new ToolBoxInfo[]{toolBoxInfo2}[0]));
            ToolBoxInfoEntity[] toolBoxInfoEntityArr = (ToolBoxInfoEntity[]) arrayList.toArray(new ToolBoxInfoEntity[0]);
            objOooO00o = c26435OoooO0O.f90798OooO00o.OooO00o((ToolBoxInfoEntity[]) Arrays.copyOf(toolBoxInfoEntityArr, toolBoxInfoEntityArr.length), this);
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            str = "global-toolbox";
        } else {
            str = (String) oooO0O0.f75156OooOo.getValue();
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
        }
        str2 = str;
        C26435OoooO0O c26435OoooO0O2 = oooO0O0.f75142OooO0o;
        this.f104696OooOo0o = str2;
        this.f104695OooOo = 2;
        obj = c26435OoooO0O2.f90799OooO0O0.toToolBoxInfo(c26435OoooO0O2.f90798OooO00o.OooO0O0(str2));
        if (obj != enumC32485OooO00o) {
            toolBoxInfo = (ToolBoxInfo) obj;
            if (toolBoxInfo != null) {
            }
            ToolBoxInfo toolBoxInfo22 = new ToolBoxInfo(C24761OooO.OooO00o("toString(...)"), str2, this.f104697OooOoO);
            C26435OoooO0O c26435OoooO0O3 = oooO0O0.f75142OooO0o;
            this.f104696OooOo0o = null;
            this.f104695OooOo = 3;
            c26435OoooO0O3.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c26435OoooO0O3.f90799OooO0O0.toEntity(new ToolBoxInfo[]{toolBoxInfo22}[0]));
            ToolBoxInfoEntity[] toolBoxInfoEntityArr2 = (ToolBoxInfoEntity[]) arrayList2.toArray(new ToolBoxInfoEntity[0]);
            objOooO00o = c26435OoooO0O3.f90798OooO00o.OooO00o((ToolBoxInfoEntity[]) Arrays.copyOf(toolBoxInfoEntityArr2, toolBoxInfoEntityArr2.length), this);
            if (objOooO00o != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
