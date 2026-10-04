package com.orion.notein.domain.mapper;

import oO0OO0oo.InterfaceC32931OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class MaterialMapper_Factory implements InterfaceC32931OooO0OO {

    public static final class InstanceHolder {
        static final MaterialMapper_Factory INSTANCE = new MaterialMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static MaterialMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MaterialMapper newInstance() {
        return new MaterialMapper();
    }

    @Override // oO00ooO0.InterfaceC32462OooO00o
    public MaterialMapper get() {
        return newInstance();
    }
}
