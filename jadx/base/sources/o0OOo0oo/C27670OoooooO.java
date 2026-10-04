package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.note.NoteHistoryVersion;
import java.util.Map;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OoO0oo.oo0o0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOo0oo.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27670OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27449o00O0OoO f97327OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27635OooOoO f97328OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27605OooO00o f97329OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<CloudMetaType, InterfaceC27660OoooOo0> f97330OooO0Oo;

    public C27670OoooooO(C27449o00O0OoO c27449o00O0OoO, C27635OooOoO c27635OooOoO, InterfaceC27605OooO00o cloudSyncRepo, Map<CloudMetaType, InterfaceC27660OoooOo0> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRepo, "cloudSyncRepo");
        this.f97327OooO00o = c27449o00O0OoO;
        this.f97328OooO0O0 = c27635OooOoO;
        this.f97329OooO0OO = cloudSyncRepo;
        this.f97330OooO0Oo = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27667OooooOo c27667OooooOo;
        Object objOooOoo;
        if (abstractC32479OooO0OO instanceof C27667OooooOo) {
            c27667OooooOo = (C27667OooooOo) abstractC32479OooO0OO;
            int i = c27667OooooOo.f97313OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27667OooooOo.f97313OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27667OooooOo = new C27667OooooOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27667OooooOo.f97312OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27667OooooOo.f97313OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27667OooooOo.f97313OooOoO0 = 1;
            objOooOoo = this.f97329OooO0OO.OooOoo(str, c27667OooooOo);
            if (objOooOoo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooOoo = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        return C32445OooOOOO.OooO00o(objOooOoo) == null ? objOooOoo : C34434OooOoO.f123453OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, NoteHistoryVersion noteHistoryVersion, oo0o0O0 oo0o0o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27669Oooooo0 c27669Oooooo0;
        if (abstractC32479OooO0OO instanceof C27669Oooooo0) {
            c27669Oooooo0 = (C27669Oooooo0) abstractC32479OooO0OO;
            int i = c27669Oooooo0.f97326OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27669Oooooo0.f97326OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27669Oooooo0 = new C27669Oooooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27669Oooooo0.f97325OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27669Oooooo0.f97326OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27668Oooooo c27668Oooooo = new C27668Oooooo(this, str, noteHistoryVersion, oo0o0o0, null);
            c27669Oooooo0.f97326OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27668Oooooo, c27669Oooooo0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }
}
