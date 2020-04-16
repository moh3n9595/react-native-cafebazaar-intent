import { NativeModules } from "react-native";

export function rate(packageName) {
    logIOS();
    if(Platform.OS === "android") {
        const { RNCafebazaarIntent } = NativeModules;
        RNCafebazaarIntent.rate(packageName);
    }
}

export function view(packageName) {
    logIOS();
    if (Platform.OS === "android") {
        const {
            RNCafebazaarIntent
        } = NativeModules;
        RNCafebazaarIntent.rate(packageName);
    }
}

export function login() {
    logIOS();
    if (Platform.OS === "android") {
        const {
            RNCafebazaarIntent
        } = NativeModules;
        RNCafebazaarIntent.login();
    }
}

export function developerCollection(developerId) {
    logIOS();
    if (Platform.OS === "android") {
        const {
            RNCafebazaarIntent
        } = NativeModules;
        RNCafebazaarIntent.developerCollection(developerId);
    }
}

function logIOS() {
    if(Platform.OS === "ios") {
        console.warn("You can't use `react-native-cafebazaar-intent` in ios");
    }
        
}
