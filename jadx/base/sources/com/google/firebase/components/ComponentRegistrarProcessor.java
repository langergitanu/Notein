package com.google.firebase.components;

import OooOo.C20485OooOoO;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new C20485OooOoO();

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
