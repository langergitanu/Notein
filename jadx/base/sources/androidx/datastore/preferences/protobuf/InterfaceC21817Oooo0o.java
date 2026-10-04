package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21816Oooo0OO;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21817Oooo0o {
    C21818Oooo0o0 OooO00o();

    C21818Oooo0o0 forMapData(Object obj);

    C21816Oooo0OO.OooO00o<?, ?> forMapMetadata(Object obj);

    C21818Oooo0o0 forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    C21818Oooo0o0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
