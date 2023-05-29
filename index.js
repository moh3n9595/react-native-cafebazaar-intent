import { NativeModules } from "react-native";

export function rate(packageName) {
    return new Promise((resolve, reject) => {
        logIOS(reject);
        if (Platform.OS === "android") {
            const {
                RNCafebazaarIntent
            } = NativeModules;
            RNCafebazaarIntent.rate(packageName).then(() => resolve()).catch(e => reject(e));
        }
    });
}

export function view(packageName) {
    return new Promise((resolve, reject) => {
        logIOS(reject);
        if (Platform.OS === "android") {
            const {
                RNCafebazaarIntent
            } = NativeModules;
            RNCafebazaarIntent.view(packageName).then(() => resolve()).catch(e => reject(e));
        }
    });
}

export function login() {
    return new Promise((resolve, reject) => {
        logIOS(reject);
        if (Platform.OS === "android") {
            const {
                RNCafebazaarIntent
            } = NativeModules;
            RNCafebazaarIntent.login().then(() => resolve()).catch(e => reject(e));
        }
    });
}

export function developerCollection(developerId) {
    return new Promise((resolve, reject) => {
        logIOS(reject);
        if (Platform.OS === "android") {
            const {
                RNCafebazaarIntent
            } = NativeModules;
            RNCafebazaarIntent.developerCollection(developerId).then(() => resolve()).catch(e => reject(e));
        }
    });
}

function logIOS(reject) {
    if(Platform.OS === "ios") {
        reject(new Error("You can't use `react-native-cafebazaar-intent` in ios"))
    }
}
export function rateMyket(packageName) {
    return new Promise((resolve, reject) => {
        logIOS(reject);
        if (Platform.OS === "android") {
            const {
                RNCafebazaarIntent
            } = NativeModules;
            RNCafebazaarIntent.rateMyket(packageName).then(() => resolve()).catch(e => reject(e));
        }
    });
}
