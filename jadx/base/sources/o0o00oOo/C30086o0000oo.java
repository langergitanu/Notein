package o0o00oOo;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOo0o.C27600o0ooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o00oOo.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.RenameDialogViewModel$parentFolder$1$1", m80623f = "RenameDialogViewModel.kt", m80624l = {32, 34, 37, 39, 41}, m80625m = "invokeSuspend")
public final class C30086o0000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super String>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractApplicationC26277OooOoOO f107074OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0000O0 f107075OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f107076OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f107077OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f107078OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC26277OooOoOO f107079OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f107080OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30086o0000oo(String str, o0000O0 o0000o0, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, Continuation continuation) {
        super(2, continuation);
        this.f107078OooOoOO = str;
        this.f107080OooOoo0 = o0000o0;
        this.f107079OooOoo = abstractApplicationC26277OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30086o0000oo c30086o0000oo = new C30086o0000oo(this.f107078OooOoOO, this.f107080OooOoo0, this.f107079OooOoo, continuation);
        c30086o0000oo.f107076OooOoO = obj;
        return c30086o0000oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C30086o0000oo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        o0000O0 o0000o0;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO;
        NoteMeta noteMeta;
        String parentId;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        o0000O0 o0000o02;
        Folder folder;
        Folder folder2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107077OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = (InterfaceC33723OooO0oO) this.f107076OooOoO;
            String str = this.f107078OooOoOO;
            if (str != null) {
                o0000O0 o0000o03 = this.f107080OooOoo0;
                int i2 = o0000o03.f107064OooO0o;
                AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO3 = this.f107079OooOoo;
                if (i2 == 0) {
                    this.f107076OooOoO = interfaceC33723OooO0oO3;
                    this.f107075OooOo0o = o0000o03;
                    this.f107074OooOo = abstractApplicationC26277OooOoOO3;
                    this.f107077OooOoO0 = 1;
                    Object objOooOoOO = o0000o03.f107063OooO0Oo.OooOoOO(str, this);
                    if (objOooOoOO != enumC32485OooO00o) {
                        interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
                        obj = objOooOoOO;
                        o0000o0 = o0000o03;
                        abstractApplicationC26277OooOoOO = abstractApplicationC26277OooOoOO3;
                        noteMeta = (NoteMeta) obj;
                        if (noteMeta != null) {
                        }
                        o0000O0 o0000o04 = o0000o0;
                        abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        o0000o02 = o0000o04;
                        parentId = null;
                    }
                } else {
                    this.f107076OooOoO = interfaceC33723OooO0oO3;
                    this.f107075OooOo0o = o0000o03;
                    this.f107074OooOo = abstractApplicationC26277OooOoOO3;
                    this.f107077OooOoO0 = 2;
                    Object objOooO0Oo = o0000o03.f107065OooO0o0.OooO0Oo(str, this);
                    if (objOooO0Oo != enumC32485OooO00o) {
                        interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
                        obj = objOooO0Oo;
                        o0000o0 = o0000o03;
                        abstractApplicationC26277OooOoOO = abstractApplicationC26277OooOoOO3;
                        folder = (Folder) obj;
                        if (folder != null) {
                        }
                        o0000O0 o0000o042 = o0000o0;
                        abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        o0000o02 = o0000o042;
                        parentId = null;
                    }
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i == 1) {
            abstractApplicationC26277OooOoOO = this.f107074OooOo;
            o0000o0 = this.f107075OooOo0o;
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f107076OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            noteMeta = (NoteMeta) obj;
            if (noteMeta != null) {
                parentId = noteMeta.getParentId();
                o0000O0 o0000o05 = o0000o0;
                abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                o0000o02 = o0000o05;
            }
            o0000O0 o0000o0422 = o0000o0;
            abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
            o0000o02 = o0000o0422;
            parentId = null;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f107076OooOoO;
                        C32446OooOOOo.OooO0O0(obj);
                        folder2 = (Folder) obj;
                        if (folder2 != null) {
                            String title = folder2.getTitle();
                            this.f107076OooOoO = null;
                            this.f107077OooOoO0 = 5;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            abstractApplicationC26277OooOoOO = this.f107074OooOo;
            o0000o0 = this.f107075OooOo0o;
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f107076OooOoO;
            C32446OooOOOo.OooO0O0(obj);
            folder = (Folder) obj;
            if (folder != null) {
                parentId = folder.getParentId();
                o0000O0 o0000o052 = o0000o0;
                abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                o0000o02 = o0000o052;
            }
            o0000O0 o0000o04222 = o0000o0;
            abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
            o0000o02 = o0000o04222;
            parentId = null;
        }
        if (parentId == null) {
            String string = abstractApplicationC26277OooOoOO2.getString(R.string.desktop);
            this.f107076OooOoO = null;
            this.f107075OooOo0o = null;
            this.f107074OooOo = null;
            this.f107077OooOoO0 = 3;
        } else {
            C27600o0ooOO0 c27600o0ooOO0 = o0000o02.f107065OooO0o0;
            this.f107076OooOoO = interfaceC33723OooO0oO2;
            this.f107075OooOo0o = null;
            this.f107074OooOo = null;
            this.f107077OooOoO0 = 4;
            obj = c27600o0ooOO0.OooO0Oo(parentId, this);
            if (obj != enumC32485OooO00o) {
                folder2 = (Folder) obj;
                if (folder2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }
        return enumC32485OooO00o;
    }
}
