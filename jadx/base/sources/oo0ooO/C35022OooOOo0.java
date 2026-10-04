package oo0ooO;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.CloudSyncDatabase_Impl;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudProviderConverters;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OO0OoO.C26719OooOOo;
import o0OO0OoO.C26721OooOOoo;
import o0OOooO0.C27919OooOoo0;
import o0OOooO0.C27949Oooooo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.C34735OoooO0O;
import oo0oO0.C34740OoooOoO;
import oo0oO0.C34849o00Oo00o;

/* JADX INFO: renamed from: oo0ooO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C35022OooOOo0 implements InterfaceC35015OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CloudSyncDatabase_Impl f125744OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CloudProviderConverters f125746OooO0OO = new CloudProviderConverters();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35020OooOOOo f125745OooO0O0 = new C35020OooOOOo(this);

    public C35022OooOOo0(CloudSyncDatabase_Impl cloudSyncDatabase_Impl) {
        this.f125744OooO00o = cloudSyncDatabase_Impl;
    }

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final Object OooO00o(final String str, final String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125744OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOOO0
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                CloudProviderConverters cloudProviderConverters = this.f125739OooOo0o.f125746OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM cloud_metas WHERE id = ? and drive_id = ? LIMIT 1");
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
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_object_key");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_sync_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra");
                    CloudMetaRemoteEntity cloudMetaRemoteEntity = null;
                    String strO000OoO = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        int i = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        CloudContentTag cloudContentTag = cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8));
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10);
                        }
                        cloudMetaRemoteEntity = new CloudMetaRemoteEntity(strO000OoO2, strO000OoO3, strO000OoO4, i, strO000OoO5, strO000OoO6, j, cloudContentTag, j2, cloudProviderConverters.toCloudMetaExtra(strO000OoO));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return cloudMetaRemoteEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final Object OooO0O0(final List list, final String str, C27919OooOoo0 c27919OooOoo0) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT * FROM cloud_metas WHERE id IN (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") AND drive_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(c27919OooOoo0, this.f125744OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                CloudProviderConverters cloudProviderConverters = this.f125730OooOo0o.f125746OooO0OO;
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
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_object_key");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_sync_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        int i3 = iOooO0Oo;
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        CloudContentTag cloudContentTag = cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8));
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10);
                        }
                        arrayList.add(new CloudMetaRemoteEntity(strO000OoO2, strO000OoO3, strO000OoO4, i4, strO000OoO5, strO000OoO6, j, cloudContentTag, j2, cloudProviderConverters.toCloudMetaExtra(strO000OoO)));
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

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final Object OooO0OO(final CloudMetaRemoteEntity[] cloudMetaRemoteEntityArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        cloudMetaRemoteEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125744OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOOOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125742OooOo0o.f125745OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, cloudMetaRemoteEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final C24718OooOO0o OooO0Oo(String str) {
        C34740OoooOoO c34740OoooOoO = new C34740OoooOoO(2, this, str);
        return C24720OooOOO0.OooO00o(this.f125744OooO00o, new String[]{"cloud_metas"}, c34740OoooOoO);
    }

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final Object OooO0o(C26719OooOOo c26719OooOOo) {
        return C24734OooO0O0.OooO0oo(c26719OooOOo, this.f125744OooO00o, new C34849o00Oo00o(this, 1), true, false);
    }

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final Object OooO0o0(String str, C26721OooOOoo c26721OooOOoo) {
        return C24734OooO0O0.OooO0oo(c26721OooOOoo, this.f125744OooO00o, new C34735OoooO0O(2, this, str), true, false);
    }

    @Override // oo0ooO.InterfaceC35015OooOO0O
    public final Object OooO0oO(final String str, final List list, C27949Oooooo0 c27949Oooooo0) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("SELECT * FROM cloud_metas WHERE drive_id = ? AND drive_object_key IN ("), list);
        return C24734OooO0O0.OooO0oo(c27949Oooooo0, this.f125744OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0ooO.OooOOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                CloudProviderConverters cloudProviderConverters = this.f125735OooOo0o.f125746OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int i = 2;
                    for (String str3 : list2) {
                        if (str3 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str3);
                        }
                        i++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "mime_type");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_version");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "meta_hash");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "drive_object_key");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_sync_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "content_tag");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "deleted");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        int i2 = iOooO0Oo;
                        int i3 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        CloudContentTag cloudContentTag = cloudProviderConverters.toCloudContentTag(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8));
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10);
                        }
                        arrayList.add(new CloudMetaRemoteEntity(strO000OoO2, strO000OoO3, strO000OoO4, i3, strO000OoO5, strO000OoO6, j, cloudContentTag, j2, cloudProviderConverters.toCloudMetaExtra(strO000OoO)));
                        iOooO0Oo = i2;
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
}
