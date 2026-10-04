package com.orion.penkit.serialization.ink.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum ToolType implements Internal.EnumLite {
    TOOL_UNKNOWN(0),
    TOOL_STYLUS(1),
    TOOL_TOUCH(2),
    TOOL_MOUSE(3),
    UNRECOGNIZED(-1);

    public static final int TOOL_MOUSE_VALUE = 3;
    public static final int TOOL_STYLUS_VALUE = 1;
    public static final int TOOL_TOUCH_VALUE = 2;
    public static final int TOOL_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<ToolType> internalValueMap = new Internal.EnumLiteMap<ToolType>() { // from class: com.orion.penkit.serialization.ink.proto.ToolType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ToolType findValueByNumber(int i) {
            return ToolType.forNumber(i);
        }
    };
    private final int value;

    public static final class ToolTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ToolTypeVerifier();

        private ToolTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ToolType.forNumber(i) != null;
        }
    }

    ToolType(int i) {
        this.value = i;
    }

    public static ToolType forNumber(int i) {
        if (i == 0) {
            return TOOL_UNKNOWN;
        }
        if (i == 1) {
            return TOOL_STYLUS;
        }
        if (i == 2) {
            return TOOL_TOUCH;
        }
        if (i != 3) {
            return null;
        }
        return TOOL_MOUSE;
    }

    public static Internal.EnumLiteMap<ToolType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ToolTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ToolType valueOf(int i) {
        return forNumber(i);
    }
}
