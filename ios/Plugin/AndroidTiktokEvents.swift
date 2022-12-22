import Foundation

@objc public class AndroidTiktokEvents: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
