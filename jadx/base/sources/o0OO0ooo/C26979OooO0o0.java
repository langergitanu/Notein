package o0OO0ooo;

import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import com.orion.notein.domain.mapper.NoteinMessageMapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34865o00OoOo;

/* JADX INFO: renamed from: o0OO0ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26979OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34865o00OoOo f93729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteinMessageMapper f93730OooO0O0;

    public C26979OooO0o0(InterfaceC34865o00OoOo msgDao, NoteinMessageMapper mapper) {
        OooOOO0.OooO0oO(msgDao, "msgDao");
        OooOOO0.OooO0oO(mapper, "mapper");
        this.f93729OooO00o = msgDao;
        this.f93730OooO0O0 = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26974OooO00o c26974OooO00o;
        C26979OooO0o0 c26979OooO0o0;
        if (abstractC32479OooO0OO instanceof C26974OooO00o) {
            c26974OooO00o = (C26974OooO00o) abstractC32479OooO0OO;
            int i = c26974OooO00o.f93705OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26974OooO00o.f93705OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26974OooO00o = new C26974OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c26974OooO00o.f93703OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26974OooO00o.f93705OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c26974OooO00o.f93704OooOo0o = this;
            c26974OooO00o.f93705OooOoO = 1;
            objOooO0Oo = this.f93729OooO00o.OooO0Oo(c26974OooO00o);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26979OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26979OooO0o0 = c26974OooO00o.f93704OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        Iterable iterable = (Iterable) objOooO0Oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26979OooO0o0.f93730OooO0O0.toNoteinMessage((NoteinMessageEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26977OooO0Oo c26977OooO0Oo;
        C26979OooO0o0 c26979OooO0o0;
        if (abstractC32479OooO0OO instanceof C26977OooO0Oo) {
            c26977OooO0Oo = (C26977OooO0Oo) abstractC32479OooO0OO;
            int i = c26977OooO0Oo.f93723OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26977OooO0Oo.f93723OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26977OooO0Oo = new C26977OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c26977OooO0Oo.f93721OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26977OooO0Oo.f93723OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c26977OooO0Oo.f93722OooOo0o = this;
            c26977OooO0Oo.f93723OooOoO = 1;
            objOooO0O0 = this.f93729OooO00o.OooO0O0(str, c26977OooO0Oo);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26979OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26979OooO0o0 = c26977OooO0Oo.f93722OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26979OooO0o0.f93730OooO0O0.toNoteinMessage((NoteinMessageEntity) it.next()));
        }
        return arrayList;
    }
}
