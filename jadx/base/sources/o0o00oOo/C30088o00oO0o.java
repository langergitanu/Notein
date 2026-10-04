package o0o00oOo;

import com.orion.notein.domain.models.folder.Folder;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27600o0ooOO0;
import o0OOoooO.C28003OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o00oOo.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$flatMapLatest$3", m80623f = "NoteListViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30088o00oO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Folder>, Folder, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f107105OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107106OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107107OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f107108OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30088o00oO0o(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f107107OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Folder> interfaceC33723OooO0oO, Folder folder, Continuation<? super C32460OooOooO> continuation) {
        C30088o00oO0o c30088o00oO0o = new C30088o00oO0o(this.f107107OooOoO, continuation);
        c30088o00oO0o.f107105OooOo = interfaceC33723OooO0oO;
        c30088o00oO0o.f107108OooOoO0 = folder;
        return c30088o00oO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String parentId;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107106OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f107105OooOo;
            Folder folder = (Folder) this.f107108OooOoO0;
            if (folder == null || (parentId = folder.getParentId()) == null) {
                parentId = "";
            }
            C27600o0ooOO0 c27600o0ooOO0 = this.f107107OooOoO.f77124OooO0oO;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(parentId);
            c27600o0ooOO0.getClass();
            C28003OooO0oo c28003OooO0ooOooO0o = c27600o0ooOO0.f96982OooO00o.OooO0o(listOooO0oO);
            this.f107106OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = c28003OooO0ooOooO0o.collect(new C30077Oooooo(interfaceC33723OooO0oO), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
