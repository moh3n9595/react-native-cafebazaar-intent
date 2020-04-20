  
  # react-native-cafebazaar-intent &middot; [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/moh3n9595/react-native-cafebazaar-intent/blob/master/LICENSE) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-orange.svg)](https://github.com/moh3n9595/react-native-cafebazaar-intent/compare)



<p align="center">
    <img src="./images/logo.png" width="127" height="50">
  <br>
  <p align="center">
    Bazaar Intent for various purposes
  </p>
  <br>
  <div align="center">
    <img src="./images/shot1.png" width="250">
    <img src="./images/shot2.png" width="250">
    <img src="./images/shot3.png" width="250">
  </div>
</p>

## Getting started

`$ npm i react-native-cafebazaar-intent`

### Mostly automatic installation (RN < 60)

`$ react-native link react-native-cafebazaar-intent`

### Manual installation (RN < 60)

#### Android

1. Open up `android/app/src/main/java/com/moh3n95/bazaarIntents/MainActivity.java`
  - Add `import com.moh3n95.bazaarIntents.RNCafebazaarIntentPackage;` to the imports at the top of the file
  - Add `new RNCafebazaarIntentPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-cafebazaar-intent'
  	project(':react-native-cafebazaar-intent').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-cafebazaar-intent/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-cafebazaar-intent')
  	```

## Usage
```javascript
import {view, rate, login, developerCollection} from 'react-native-cafebazaar-intent';

view("YOUR_APP_PACKAGE_NAME")
  .then(() => console.log('OK'))
  .catch((e) => console.log(e));

rate("YOUR_APP_PACKAGE_NAME")
  .then(() => console.log('OK'))
  .catch((e) => console.log(e));

login()
  .then(() => console.log('OK'))
  .catch((e) => console.log(e));

developerCollection("YOUR_DEVELOPER_ID")
  .then(() => console.log('OK'))
  .catch((e) => console.log(e));

```

## Notice

This package is based on [Bazaar Technical Documents](https://developers.cafebazaar.ir/en/docs/bazaar-services-intent/)

## Contributing

Thank you for your interest in contributing! Please feel free to put up a PR for any issue or feature request.

## Give me a Star

If you think this project is helpful just give me a ⭐️ Star is enough because i don't drink coffee 😃

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/moh3n9595/react-native-cafebazaar-intent/blob/master/LICENSE) file for details

## Author

Made with ❤️ by [Mohsen Madani](https://github.com/moh3n9595).