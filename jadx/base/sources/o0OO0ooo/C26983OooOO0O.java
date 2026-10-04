package o0OO0ooo;

import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import com.orion.notein.data.service.dto.NoteinMessageDto;
import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo0;
import oo0oO0.InterfaceC34865o00OoOo;

/* JADX INFO: renamed from: o0OO0ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26983OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26979OooO0o0 f93737OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26981OooO0oo f93738OooO0O0;

    public C26983OooOO0O(C26979OooO0o0 c26979OooO0o0, C26981OooO0oo c26981OooO0oo) {
        this.f93737OooO00o = c26979OooO0o0;
        this.f93738OooO0O0 = c26981OooO0oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116 A[LOOP:0: B:50:0x0110->B:52:0x0116, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0192 A[LOOP:2: B:62:0x018c->B:64:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26973OooO c26973OooO;
        C26983OooOO0O c26983OooOO0O;
        List list;
        List list2;
        String str2;
        List list3;
        C26983OooOO0O c26983OooOO0O2;
        int iOooO0Oo;
        Iterator it;
        Object objOooO0o;
        String str3;
        C26983OooOO0O c26983OooOO0O3;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof C26973OooO) {
            c26973OooO = (C26973OooO) abstractC32479OooO0OO;
            int i = c26973OooO.f93702OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26973OooO.f93702OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26973OooO = new C26973OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26973OooO.f93699OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26973OooO.f93702OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            int length = str4.length();
            C26981OooO0oo c26981OooO0oo = this.f93738OooO0O0;
            if (length == 0) {
                c26973OooO.f93698OooOo0o = this;
                c26973OooO.f93697OooOo = str4;
                c26973OooO.f93702OooOoo0 = 1;
                objOooO00o = c26981OooO0oo.OooO0O0(c26973OooO);
                if (objOooO00o != obj) {
                    c26983OooOO0O = this;
                    list = (List) objOooO00o;
                }
            } else {
                c26973OooO.f93698OooOo0o = this;
                c26973OooO.f93697OooOo = str4;
                c26973OooO.f93702OooOoo0 = 2;
                objOooO00o = c26981OooO0oo.OooO00o(str4, c26973OooO);
                if (objOooO00o != obj) {
                    c26983OooOO0O = this;
                    list = (List) objOooO00o;
                }
            }
        }
        if (i2 == 1) {
            str4 = c26973OooO.f93697OooOo;
            c26983OooOO0O = c26973OooO.f93698OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            list = (List) objOooO00o;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(objOooO00o);
                        return objOooO00o;
                    }
                    str3 = c26973OooO.f93697OooOo;
                    c26983OooOO0O3 = c26973OooO.f93698OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    C26979OooO0o0 c26979OooO0o0 = c26983OooOO0O3.f93737OooO00o;
                    c26973OooO.f93698OooOo0o = null;
                    c26973OooO.f93697OooOo = null;
                    c26973OooO.f93702OooOoo0 = 5;
                    Object objOooO0O0 = c26979OooO0o0.OooO0O0(str3, c26973OooO);
                    return objOooO0O0 != obj ? obj : objOooO0O0;
                }
                list3 = (List) c26973OooO.f93700OooOoO0;
                str2 = c26973OooO.f93697OooOo;
                c26983OooOO0O2 = c26973OooO.f93698OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                Iterable<NoteinMessage> iterable = (Iterable) objOooO00o;
                iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (NoteinMessage noteinMessage : iterable) {
                    linkedHashMap.put(noteinMessage.getId(), new Integer(noteinMessage.getUnread()));
                }
                List<NoteinMessage> list4 = list3;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                for (NoteinMessage noteinMessage2 : list4) {
                    Integer num = (Integer) linkedHashMap.get(noteinMessage2.getId());
                    arrayList.add(NoteinMessage.copy$default(noteinMessage2, null, null, null, null, null, 0, num != null ? num.intValue() : 1, 63, null));
                }
                C26979OooO0o0 c26979OooO0o02 = c26983OooOO0O2.f93737OooO00o;
                c26973OooO.f93698OooOo0o = c26983OooOO0O2;
                c26973OooO.f93697OooOo = str2;
                c26973OooO.f93700OooOoO0 = null;
                c26973OooO.f93702OooOoo0 = 4;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(c26979OooO0o02.f93730OooO0O0.toEntity((NoteinMessage) it.next()));
                }
                NoteinMessageEntity[] noteinMessageEntityArr = (NoteinMessageEntity[]) arrayList2.toArray(new NoteinMessageEntity[0]);
                objOooO0o = c26979OooO0o02.f93729OooO00o.OooO0o((NoteinMessageEntity[]) Arrays.copyOf(noteinMessageEntityArr, noteinMessageEntityArr.length), c26973OooO);
                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o != obj) {
                    str3 = str2;
                    c26983OooOO0O3 = c26983OooOO0O2;
                    C26979OooO0o0 c26979OooO0o03 = c26983OooOO0O3.f93737OooO00o;
                    c26973OooO.f93698OooOo0o = null;
                    c26973OooO.f93697OooOo = null;
                    c26973OooO.f93702OooOoo0 = 5;
                    Object objOooO0O02 = c26979OooO0o03.OooO0O0(str3, c26973OooO);
                    if (objOooO0O02 != obj) {
                    }
                }
            }
            str4 = c26973OooO.f93697OooOo;
            c26983OooOO0O = c26973OooO.f93698OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            list = (List) objOooO00o;
        }
        if (list != null) {
            List<NoteinMessageDto> list5 = list;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
            for (NoteinMessageDto noteinMessageDto : list5) {
                c26983OooOO0O.getClass();
                arrayList3.add(new NoteinMessage(noteinMessageDto.getId(), noteinMessageDto.getUid(), noteinMessageDto.getTitle(), noteinMessageDto.getContent(), noteinMessageDto.getCreationTime(), noteinMessageDto.getType(), 1));
            }
            list2 = arrayList3;
        } else {
            list2 = C34434OooOoO.f123453OooOo0o;
        }
        C26979OooO0o0 c26979OooO0o04 = c26983OooOO0O.f93737OooO00o;
        c26973OooO.f93698OooOo0o = c26983OooOO0O;
        c26973OooO.f93697OooOo = str4;
        c26973OooO.f93700OooOoO0 = list2;
        c26973OooO.f93702OooOoo0 = 3;
        Object objOooO00o2 = c26979OooO0o04.OooO00o(c26973OooO);
        if (objOooO00o2 != obj) {
            C26983OooOO0O c26983OooOO0O4 = c26983OooOO0O;
            str2 = str4;
            list3 = list2;
            objOooO00o = objOooO00o2;
            c26983OooOO0O2 = c26983OooOO0O4;
            Iterable<NoteinMessage> iterable2 = (Iterable) objOooO00o;
            iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable2, 10));
            if (iOooO0Oo < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
            while (r2.hasNext()) {
            }
            List<NoteinMessage> list42 = list3;
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list42, 10));
            while (r1.hasNext()) {
            }
            C26979OooO0o0 c26979OooO0o022 = c26983OooOO0O2.f93737OooO00o;
            c26973OooO.f93698OooOo0o = c26983OooOO0O2;
            c26973OooO.f93697OooOo = str2;
            c26973OooO.f93700OooOoO0 = null;
            c26973OooO.f93702OooOoo0 = 4;
            ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
            it = arrayList4.iterator();
            while (it.hasNext()) {
            }
            NoteinMessageEntity[] noteinMessageEntityArr2 = (NoteinMessageEntity[]) arrayList22.toArray(new NoteinMessageEntity[0]);
            objOooO0o = c26979OooO0o022.f93729OooO00o.OooO0o((NoteinMessageEntity[]) Arrays.copyOf(noteinMessageEntityArr2, noteinMessageEntityArr2.length), c26973OooO);
            if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
            }
            if (objOooO0o != obj) {
            }
        }
    }

    public final InterfaceC33721OooO0o OooO0O0(String uid) {
        OooOOO0.OooO0oO(uid, "uid");
        C26979OooO0o0 c26979OooO0o0 = this.f93737OooO00o;
        InterfaceC34865o00OoOo interfaceC34865o00OoOo = c26979OooO0o0.f93729OooO00o;
        return new C33763OoooOOO(new C26976OooO0OO(interfaceC34865o00OoOo.OooO00o(uid), c26979OooO0o0), new C26975OooO0O0(interfaceC34865o00OoOo.OooO0o0(), c26979OooO0o0), new C26982OooOO0(3, null));
    }
}
