package oo0oO0;

import com.orion.notein.data.p602db.entity.DualLinkRefEntity;
import java.util.List;
import o0OO00o0.C26500Oooo0o0;
import oO00ooo.AbstractC32476OooO;

/* JADX INFO: loaded from: classes9.dex */
public interface oo000o {
    Object OooO(List list, o0OO00o0.Oooo000 oooo000);

    void OooO0O0(String str);

    List<DualLinkRefEntity> OooO0OO(String str);

    void OooO0Oo(String str);

    Object OooO0o(DualLinkRefEntity[] dualLinkRefEntityArr, C26500Oooo0o0 c26500Oooo0o0);

    List<DualLinkRefEntity> OooO0o0(String str);

    default List<DualLinkRefEntity> OooO0oO(List<String> pageIds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageIds, "pageIds");
        return OooOO0(pageIds);
    }

    Object OooO0oo(DualLinkRefEntity[] dualLinkRefEntityArr, AbstractC32476OooO abstractC32476OooO);

    List<DualLinkRefEntity> OooOO0(List<String> list);

    List<DualLinkRefEntity> getAll();
}
