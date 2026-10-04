package oo0ooO;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.CloudSyncDatabase_Impl;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalStagedContentEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudProviderConverters;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OO0OoO.C26739Oooo0oO;
import o0OOooO0.C27914OooOo0o;
import o0OOooO0.C27919OooOoo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.C34725Oooo00o;

/* JADX INFO: renamed from: oo0ooO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35014OooOO0 implements InterfaceC35006OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CloudSyncDatabase_Impl f125725OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CloudProviderConverters f125727OooO0OO = new CloudProviderConverters();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35013OooO0oo f125726OooO0O0 = new C35013OooO0oo(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C35005OooO f125728OooO0Oo = new C35005OooO(this);

    public C35014OooOO0(CloudSyncDatabase_Impl cloudSyncDatabase_Impl) {
        this.f125725OooO00o = cloudSyncDatabase_Impl;
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final Object OooO00o(final String str, final String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125725OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooO0o0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                CloudProviderConverters cloudProviderConverters = this.f125720OooOo0o.f125727OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM cloud_metas_local WHERE id = ? AND drive_id = ? LIMIT 1");
                String str3 = str;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    String str4 = str2;
                    if (str4 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str4);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_version");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sync_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "staged_content_tag");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted_remote");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_error_code");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        cloudMetaLocalEntity = new CloudMetaLocalEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), cloudProviderConverters.toCloudSyncState(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8)), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return cloudMetaLocalEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final Object OooO0O0(final List list, final String str, C27919OooOoo0 c27919OooOoo0) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT * FROM cloud_metas_local WHERE id IN (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") AND drive_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27919OooOoo0, this.f125725OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooO0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                CloudProviderConverters cloudProviderConverters = this.f125710OooOo0o.f125727OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str2);
                        }
                        i++;
                    }
                    int i2 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str3);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_version");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sync_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "staged_content_tag");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted_remote");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_error_code");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i3 = iOooO0Oo;
                        arrayList.add(new CloudMetaLocalEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), cloudProviderConverters.toCloudSyncState(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8)), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12)));
                        iOooO0Oo = i3;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final C24718OooOO0o OooO0OO(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                CloudProviderConverters cloudProviderConverters = this.f125718OooOo0o.f125727OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM cloud_metas_local WHERE drive_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_version");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sync_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "staged_content_tag");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted_remote");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_error_code");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        int i = iOooO0Oo;
                        CloudProviderConverters cloudProviderConverters2 = cloudProviderConverters;
                        arrayList.add(new CloudMetaLocalEntity(strO000OoO, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), cloudProviderConverters.toCloudSyncState(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8)), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12)));
                        cloudProviderConverters = cloudProviderConverters2;
                        iOooO0Oo = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125725OooO00o, new String[]{"cloud_metas_local"}, interfaceC32507OooOO0o);
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final Object OooO0Oo(final CloudMetaLocalEntity cloudMetaLocalEntity, C26739Oooo0oO c26739Oooo0oO) {
        cloudMetaLocalEntity.getClass();
        return C24734OooO0O0.OooO0oo(c26739Oooo0oO, this.f125725OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooO0OO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125715OooOo0o.f125726OooO0O0.OooOoOO((InterfaceC24747OooO0O0) obj, cloudMetaLocalEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final Object OooO0o(o0OO0OoO.OooOOO oooOOO) {
        return C24734OooO0O0.OooO0oo(oooOOO, this.f125725OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooO0Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                CloudProviderConverters cloudProviderConverters = this.f125716OooOo0o.f125727OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM cloud_metas_local");
                try {
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_version");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sync_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "staged_content_tag");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted_remote");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_error_code");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        int i = iOooO0Oo;
                        CloudProviderConverters cloudProviderConverters2 = cloudProviderConverters;
                        arrayList.add(new CloudMetaLocalEntity(strO000OoO, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), cloudProviderConverters.toCloudSyncState(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5)), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8)), cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)) != 0, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12)));
                        cloudProviderConverters = cloudProviderConverters2;
                        iOooO0Oo = i;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final Object OooO0o0(String str, o0OO0OoO.OooOOOO oooOOOO) {
        return C24734OooO0O0.OooO0oo(oooOOOO, this.f125725OooO00o, new C34725Oooo00o(this, str), true, false);
    }

    @Override // oo0ooO.InterfaceC35006OooO00o
    public final Object OooO0oO(final CloudMetaLocalStagedContentEntity cloudMetaLocalStagedContentEntity, C27914OooOo0o c27914OooOo0o) {
        return C24734OooO0O0.OooO0oo(c27914OooOo0o, this.f125725OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooO0oO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125723OooOo0o.f125728OooO0Oo.o000oOoO((InterfaceC24747OooO0O0) obj, cloudMetaLocalStagedContentEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
